package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.CompanyListResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NodeResponse;
import com.grape.controller.reponse.PageResponse;
import com.grape.controller.reponse.ProductNodeResponse;
import com.grape.controller.reponse.ProductResponse;
import com.grape.controller.reponse.ProductResponse2;
import com.grape.controller.reponse.ProductnodeAndTaskInfo;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.TaskinfoResponse;
import com.grape.controller.request.ComTypeRequest;
import com.grape.controller.request.NoidRequest;
import com.grape.controller.request.PathNodeRequest;
import com.grape.controller.request.ProductFormRequest;
import com.grape.controller.request.ProductNoRequest;
import com.grape.controller.request.ProductNodeInfoRequest;
import com.grape.controller.request.ProductNodeRequest;
import com.grape.controller.request.ProductRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.Codetask;
import com.grape.model.db.Organization;
import com.grape.model.db.Page;
import com.grape.model.db.Person;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.service.CodetableService;
import com.grape.service.CompanyService;
import com.grape.service.PersonService;
import com.grape.service.ProductnodeService;

import StatusCode.MessageDetail;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/productManager")
public class ProductController {
	@Autowired
	private PersonService personService;
	@Autowired
	private ProductnodeService productnodeService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private CodetableService codetableService;
	
	@RequestMapping("/selectProductNodeByProductno")
	@ApiOperation(value="根据产品编号和其他节点信息查询产品下的节点",notes="查询产品节点的第一个接口",httpMethod="POST",response=ProductNodeResponse.class)
	public Response selectProductnodeByProdtctno(@RequestBody ProductNodeInfoRequest req){
		Integer pagenum = req.getPagenum();
		Integer pagestart = (req.getPagenum()-1)*(req.getPagesize());
		req.setPagenum(pagestart);
		List<Productnode> productnodes = productnodeService.selectProductNodeByProductno(req);
		Integer count = productnodeService.selectProductNodeCount(req);
		if(productnodes!=null && productnodes.size()>0){
			/*for(int i=0;i<productnodes.size();i++){
				String nodetype = productnodes.get(i).getType();
				String codtyp="APPROVALTYPE";
				Codetable codetable = codetableService.selectCodetableByCodtypAndflg(nodetype, codtyp);
				if(codetable!=null){
					productnodes.get(i).setType(codetable.getCoddes());
				}
			}*/
			
			return new ProductNodeResponse(productnodes,pagenum,count);
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
	}
	
	@RequestMapping("/insertProductNode")
	@ApiOperation(value="新增产品节点信息",notes="新增产品节点的第一个接口",httpMethod="POST",response=RestfulResponse.class)
	public Response insertProductNode(@RequestBody ProductNodeRequest req){
		String nodeid = req.getNodeid();
		String type= req.getType();
		NoidRequest request = new NoidRequest();
		request.setNodeid(nodeid);
		request.setType(type);
		//先判断是否已经存在了该节点，如果存在该节点则不再进行后续操作
		Productnode productnode = productnodeService.selectProductnodeByPrimartKey(request);
		if(productnode!=null){
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.EXIST_PRODUCTNODE);
		}
		productnodeService.insertProductnode(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectTaskList")
	@ApiOperation(value="查询所有节点任务列表信息，节点任务信息下拉框",notes="查询节点列表信息的第一个接口",httpMethod="POST",response=TaskinfoResponse.class)
	public Response selectTaskList(){
		List<Codetask> list = new ArrayList<Codetask>();
		list = productnodeService.selectAllTaskInfo();
		if(list!=null && list.size()>0){
			return new TaskinfoResponse(list);
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
		
	}
	
	@RequestMapping("/deleteProductNode")
	@ApiOperation(value="删除产品节点信息",notes="删除产品节点",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteProductNode(@RequestBody NoidRequest req){
		productnodeService.deleteProductNode(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/updateProductNodeState")
	@ApiOperation(value="激活产品节点信息",notes="激活产品节点信息",httpMethod="POST",response=RestfulResponse.class)
	public Response updateProductNodeState(@RequestBody ProductNodeInfoRequest req){
		productnodeService.activeProductNode(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectProductnodeByNodeidAndType")
	@ApiOperation(value="查看节点基本信息",notes="查询节点信息的第二个接口",httpMethod="POST",response=NodeResponse.class)
	public Response selectProductnodeByNodeidAndType(@RequestBody NoidRequest req){
		ProductnodeAndTaskInfo productnodeAndTaskInfo = productnodeService.selectProductnodeByNodeidAndType(req);
		if(productnodeAndTaskInfo!=null){
			return productnodeAndTaskInfo;
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
	}
	
	@RequestMapping("/updateProductnode")
	@ApiOperation(value="更新节点信息",notes="更新节点信息",httpMethod="POST",response=RestfulResponse.class)
	public Response updateProductnode(@RequestBody ProductNodeRequest req){
		productnodeService.updateProductnode(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/insertPathNodeInfo")
	@ApiOperation(value="修改节点路径信息",notes="新增节点路径信息一",httpMethod="POST",response=RestfulResponse.class)
	public Response insertPathNodeInfo(@RequestBody PathNodeRequest req){
		productnodeService.insertPathNodeInfo(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping(value="/selectProduct")
	@ApiOperation(value="查询产品信息接口",notes="查询产品信息的接口",httpMethod="POST",response=ProductResponse.class)
	public Response selectProduct(@RequestBody ProductRequest req){
		List<Product> list = productnodeService.seleatProductInfo(req);
		if(list!=null && list.size()>0){
			for(int i=0;i<list.size();i++){
				String producttype = list.get(i).getProducttype();
				Codetable codetable = codetableService.selectCodetableByCodtypAndflg(producttype, "PRODUCTTYPE");
				if(codetable!=null){
					list.get(i).setProducttype(codetable.getCoddes());
				}
				String chgtl = list.get(i).getChgtl();
				Person person = personService.selectPersonByWorkerid(chgtl);
				if(person!=null && person.getWorkername()!=null){
					list.get(i).setChgtl(person.getWorkername());
				}
			}
			return new ProductResponse(list);
		}
		return null;
	}
	
	@RequestMapping("/selectProductDetail")
	@ApiOperation(value="查询产品详细信息",notes="查询产品详细信息接口",httpMethod="POST",response=ProductResponse2.class)
	public Response selectProductDetail(@RequestBody ProductRequest req){
		Product product = productnodeService.selectProductDetail(req);
		if(product!=null){
			return new ProductResponse2(product);
		}
		return null;
	}
	
	@RequestMapping("/updateProduct")
	@ApiOperation(value="修改产品信息接口",notes="修改产品信息接口接口",httpMethod="POST",response=RestfulResponse.class)
	public Response updateProduct(@RequestBody ProductFormRequest req){
		productnodeService.updateProduct(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/publicProduct")
	@ApiOperation(value="发布产品信息接口",notes="发布产品信息接口接口",httpMethod="POST",response=RestfulResponse.class)
	public Response publicProduct(@RequestBody ProductFormRequest req){
		productnodeService.publicProduct(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/deleteProduct")
	@ApiOperation(value="删除产品信息接口",notes="删除产品信息接口",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteProduct(@RequestBody ProductFormRequest req){
		productnodeService.deleteProduct(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/insertProduct")
	@ApiOperation(value="新增产品信息接口",notes="新增产品信息接口接口",httpMethod="POST",response=RestfulResponse.class)
	public Response insertProduct(@RequestBody ProductFormRequest req){
		String productno =req.getProductno();
		Product product = productnodeService.selectProductByProductno(productno);
		if(product!=null){
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.EXIST_PRODUCT);
		}else{
			productnodeService.insertProduct(req);
		}
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectProductPage")
	@ApiOperation(value="查询产品配置侧边栏",notes="查询产品配置侧边栏",httpMethod="POST",response=PageResponse.class)
	public Response selectProductPage(){
		List<Page> list = productnodeService.selectProductPage();
		return new PageResponse(list);
	}
	
	@RequestMapping("/selectDispatchNode")
	@ApiOperation(value="查询所有派单节点",notes="查询所有派单节点",httpMethod="POST",response=ProductNodeResponse.class)
	public Response selectDispatchNode(@RequestBody ProductNoRequest req){
		List<Productnode> list = productnodeService.selectProductnodeByType(req);
		if(list!=null && list.size()>0){
			return new ProductNodeResponse(list,0,0);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/selectCompanyList")
	@ApiOperation(value="查询下拉框的机构列表",notes="查询下拉框的机构列表",httpMethod="POST",response=CompanyListResponse.class)
	public Response selectCompanyList(){
		//资金方
		ComTypeRequest req1 = new ComTypeRequest();
		req1.setOrgtype("02");
		//通道方
		ComTypeRequest req2 = new ComTypeRequest();
		req2.setOrgtype("03");
		//渠道方
		ComTypeRequest req3 = new ComTypeRequest();
		req3.setOrgtype("01");
		//平台方
		ComTypeRequest req4 = new ComTypeRequest();
		req4.setOrgtype("04");
		List<Organization> capitallist = companyService.selectOrganizationByType(req1);
		List<Organization> channellist = companyService.selectOrganizationByType(req2);
		List<Organization> ditchlist = companyService.selectOrganizationByType(req3);
		List<Organization> terracelist = companyService.selectOrganizationByType(req4);
		List<Organization> alllist = companyService.selectAllOrganization();
		return new CompanyListResponse(capitallist,channellist,ditchlist,terracelist,alllist);
	}
	
}
