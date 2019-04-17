package com.grape.controller;

import com.grape.controller.bean.FinalParam;
import com.grape.controller.bean.ImageBean1;
import com.grape.controller.bean.ImageBean2;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.*;
import com.grape.controller.request.*;
import com.grape.model.db.Doctask;
import com.grape.model.db.Image;
import com.grape.model.db.Procnodefile;
import com.grape.model.db.Productnode;
import com.grape.service.DoctaskService;
import com.grape.service.ImageService;
import com.grape.service.ProcnodefileService;
import com.grape.service.ProductnodeService;
import com.grape.util.HttpUtil;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/image")
public class ImageController {
	@Autowired
	private ImageService imageService;
	@Autowired
	private DoctaskService doctaskService;
	@Autowired
    private ProductnodeService productnodeService ;
	@Autowired
	private ProcnodefileService procnodefileService ;

    /*@Autowired
    private PaymentapplyinfoService paymentapplyinfoService;*/
	@ApiOperation(value="查询影像文件的第一个接口",notes="查询与一下午经济的第一个接口",httpMethod="POST",response=ImageResponse.class)
	@RequestMapping("/selectImageByWorkid")
	public Response selectImageByWorkid(@RequestBody WorkidRequest req){
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
		String productno="";
		if(doctask.getProductno()!=null){
			productno=doctask.getProductno();
		}
		WorkidAndProductnoRequest request = new WorkidAndProductnoRequest();
		request.setWorkid(req.getWorkid());
		request.setProductno(productno);
		//获取所有附件信息
		List<ImageBean1> list = imageService.selectImageByWorkid(request);
		if(list!=null && !list.isEmpty()){ 
			List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
			List<String> typrelist= new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				/*//从OSS上获取附件的文件大小
				String imagename = list.get(i).getImagename();
				if(imagename.contains("#")){
					imagename=imagename.replace("#", "%23");
				}
				if(imagename.contains(" ")){
					imagename=imagename.replace(" ", "%20");
				}
				if(imagename!=null && (imagename.contains("jpg") || imagename.contains("png") || imagename.contains("image") || imagename.contains("jpeg") || imagename.contains("bmp")|| imagename.contains("gif") || imagename.contains("tif"))){
					StringBuffer sb = new StringBuffer();
					//OSS固定获取路径URL
					String url = FinalParam.IMAGEURL;
					sb=sb.append(url);
					sb=sb.append(imagename).append("?x-oss-process=image/info");
					String result = HttpUtil.doGet(sb.toString());
					if(result!=null){
						JSONObject jsonobject = JSONObject.fromObject(result);
						JSONObject sizeresult = JSONObject.fromObject(jsonobject.get("FileSize"));
						String stringfilesize = (String) sizeresult.get("value");
						Long longfilesize = Long.parseLong(stringfilesize);
						//将文件大小转成对应格式
						if(longfilesize!=null){
							String filesize = HttpUtil.FormetFileSize(longfilesize);
							list.get(i).setFilesize(filesize);
						}
					}
				}*/
				//将不存在文件类型的附件排除在外
				if(!typrelist.contains(list.get(i).getFiletype()) && list.get(i).getFiletype()!=null){
					typrelist.add(list.get(i).getFiletype());
					
				}
			}
			//将存在文件；类型的附件加入到列表中
			if(typrelist!=null && !typrelist.isEmpty()){
				for(int j=0;j<typrelist.size();j++){
					List<ImageBean1> listbean = new ArrayList<ImageBean1>();
					for(int k=0;k<list.size();k++){
						if(list.get(k).getFiletype()!=null && typrelist.get(j)!=null){
							if(typrelist.get(j).equals(list.get(k).getFiletype())){
								listbean.add(list.get(k));
							}
						}
					}
					imagelist.add(listbean);
				}
			}
			return new ImageResponse(imagelist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="查询节点附件",notes="查询与一下午经济的第二个接口",httpMethod="POST",response=ImageResponse.class)
	@RequestMapping("/selectImageByWorkidAndNodeid")
	public Response selectImageByWorkidAndNodeid(@RequestBody WorkidAndNodeidRequest req){
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
		String productno="";
		String nodeid = "" ;
		List<ImageBean1> list = new ArrayList<>() ;
		if(doctask.getProductno()!=null){
			productno=doctask.getProductno();
		}

//		List<ImageBean1> listtest = imageService.selectImageByWorkidAndNodeid(req);
		List<ImageBean1> listtest = new ArrayList<>() ;
        List<Productnode> productnodes = productnodeService.selectByNodeid(req.getNodeid()) ;
		req.setProductno(productno);
		if(productnodes != null && productnodes.size() > 0) {
            String nodename = productnodes.get(0).getNodename() ;
            if(null != nodename && "资金方一级审批".equals(nodename)) {
                Map<String , Object> map = new HashMap<>() ;
                map.put("workid" , req.getWorkid()) ;
                map.put("productno" ,productno) ;
				list = imageService.selectChanapprove(map) ;
            }else{
				list = imageService.selectImageByWorkidAndNodeid(req);
			}
        }
		if(list!=null){
			List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
			List<String> typrelist= new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				if(!typrelist.contains(list.get(i).getFiletype()) && list.get(i).getFiletype()!=null){
					typrelist.add(list.get(i).getFiletype());
				}
			}
			for(int j=0;j<typrelist.size();j++){
				List<ImageBean1> listbean = new ArrayList<ImageBean1>();
				for(int k=0;k<list.size();k++){
					if(list.get(k).getFiletype().equals(typrelist.get(j))){
						listbean.add(list.get(k));
					}
				}
				imagelist.add(listbean);
			}
			return new ImageResponse(imagelist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="上传附件",notes="插入附件的接口",httpMethod="POST",response=ImageResponse.class)
	@RequestMapping("/insertImage")
	public Response insertImage(@RequestBody ImageRequest req){
		List<Image> list = imageService.selectImageByWorkid(req);
		if(list!=null && !list.isEmpty()){
			imageService.deleteImage(req);
			imageService.insertImage(req);
		}else{
			imageService.insertImage(req);
		}
		return new ImagefulResponse();
	}
	
	
	@ApiOperation(value="查询image2",notes="",httpMethod="POST",response=ImageResponse2.class)
	@RequestMapping("/selectImage2")
	public Response selectImage2(@RequestBody WorkidAndNodeidRequest req){
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
		String productno="";
		if(doctask.getProductno()!=null){
			productno=doctask.getProductno();
		}
		req.setProductno(productno);
		WorkidAndProductnoRequest request = new WorkidAndProductnoRequest() ;
		request.setWorkid(req.getWorkid());
		request.setProductno(req.getProductno());
		List<ImageBean1> list = imageService.selectImageByWorkid(request);
		
		List<ImageBean2> imList = new ArrayList<ImageBean2>() ;
		if(list!=null){
			List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
			List<String> typrelist= new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				StringBuffer sb = new StringBuffer();
				//OSS固定获取路径URL
				String url = FinalParam.IMAGEURL;
				sb=sb.append(url);
				//从OSS上获取附件的文件大小
				String imagename = list.get(i).getImagename();
				if(imagename.contains("#")){
					imagename=imagename.replace("#", "%23");
				}
				if(imagename.contains(" ")){
					imagename=imagename.replace(" ", "%20");
				}
				if(imagename!=null && (imagename.contains("jpg") || imagename.contains("png") || imagename.contains("image") || imagename.contains("jpeg") || imagename.contains("bmp")|| imagename.contains("gif") || imagename.contains("tif"))){
					sb=sb.append(imagename).append("?x-oss-process=image/info");
					String result = HttpUtil.doGet(sb.toString());
					if(result!=null){
						JSONObject jsonobject = JSONObject.fromObject(result);
						JSONObject sizeresult = JSONObject.fromObject(jsonobject.get("FileSize"));
						String stringfilesize = (String) sizeresult.get("value");
						Long longfilesize = Long.parseLong(stringfilesize);
						//将文件大小转成对应格式
						if(longfilesize!=null){
							String filesize = HttpUtil.FormetFileSize(longfilesize);
							list.get(i).setFilesize(filesize);
						}
					}
				}
				if(!typrelist.contains(list.get(i).getFiletype()) && list.get(i).getFiletype()!=null){
					typrelist.add(list.get(i).getFiletype());
				}
			}
			for(int j=0;j<typrelist.size();j++){
				List<ImageBean1> listbean = new ArrayList<ImageBean1>();	
				ImageBean2 imb2 = new ImageBean2() ;
				for(int k=0;k<list.size();k++){
					if(list.get(k).getFiletype()!=null && typrelist.get(j)!=null){
						if(typrelist.get(j).equals(list.get(k).getFiletype())){				
						listbean.add(list.get(k));						
						}
					}
					if(!listbean.isEmpty()) {
						imb2.setId(listbean.get(0).getImageid());
						imb2.setType(listbean.get(0).getFiletype());
						imb2.setName(listbean.get(0).getFilename());
						imb2.setList(listbean);
					}
					
				}
				
				imList.add(imb2) ;
			}
			
			return new ImageResponse2(imList);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}

	@ApiOperation(value="附件锚点",notes="资金方一级回显附件",httpMethod="POST",response=ImageResponse.class)
	@RequestMapping("/anchorsImageByWorkidAndNodeid")
	public Response echoImageByWorkidAndNodeid(@RequestBody WorkidAndNodeidRequest req){
		String productno="";
		req.setProductno(productno);
		List<ImageBean1> list = imageService.selectByWorkid2(req.getWorkid());
		List<ImageBean> nameList = new ArrayList<>() ;
		IdRequest id = new IdRequest() ;
		if(list!=null){
			List<String> typrelist= new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				ImageBean imageBean = new ImageBean() ;
				if(list.get(i).getImagetype()!=null && !typrelist.contains(list.get(i).getImagetype())){
					typrelist.add(list.get(i).getImagetype());
					id.setId(list.get(i).getImagetype());
                    List<Procnodefile> procnodefile = procnodefileService.queryByFiletype(id);
                    if(null != procnodefile && procnodefile.size() > 0) {
                        imageBean.setFiletype(list.get(i).getImagetype());
                        imageBean.setFilename(procnodefile.get(0).getFilename());
                        nameList.add(imageBean) ;
                    }
                }
			}
			return new ImagenameResponse(nameList);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
}
