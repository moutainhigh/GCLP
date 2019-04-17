package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.IdRequest;
import com.grape.controller.request.MortgageRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Image;
import com.grape.model.db.ImageExample;
import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.model.mapper.base.MortgageMapper;
import com.grape.service.MortgageService;
import com.grape.util.Util;
@Service
public class MortgageServiceImpl implements MortgageService{
	private static Logger log = LoggerFactory.getLogger(IncomeinfoServiceImpl.class);
	@Autowired
	private MortgageMapper mortgageMapper;
	@Autowired
	private ImageMapper imageMapper;
	@Override
	public Mortgage queryMortgageById(IdRequest req) {
		Mortgage page = mortgageMapper.selectByPrimaryKey(req.getId());
		return page;
	}
	@Override
	public void updateMortgage(MortgageRequest req) {
		List<String> list = req.getPropertyownerlist();
		boolean first = true;
		StringBuilder result = new StringBuilder();
		if(!list.isEmpty()){
			for(int j=0;j<list.size();j++){
				if(first){
					first=false;
				}else{
					result.append(",");
				}
				result.append(list.get(j));
			}
		}
		String propertyowner = result.toString();
		Mortgage mort = new Mortgage();
		try {
			Util.transferFields(req, mort);
			mort.setPropertyowner(propertyowner);
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		Image image = new Image();
		ImageExample example = new ImageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid()).andImagetypeEqualTo("3");
		if(!imageMapper.selectByExample(example).isEmpty()){
			imageMapper.deleteByExample(example);
		}
		String[] imagenames = req.getCertificateurl().split(",");
		for(int i=0;i<imagenames.length;i++){
			String imagename = imagenames[i];
			String id = Util.getID();
			String savetype = "3";
			image.setImageid(id);
			image.setImagename(imagename);
			image.setImagetype(savetype);
			image.setChgdt(new Date());
			image.setNodeid(req.getNodeid());
			image.setWorkid(req.getWorkid());
			imageMapper.insertSelective(image);
		}
		mortgageMapper.updateByPrimaryKey(mort);
		
	}
	
	@Override
	public void insertMortgage(MortgageRequest req) {
		List<String> list = req.getPropertyownerlist();
		boolean first = true;
		StringBuilder result = new StringBuilder();
		if(!list.isEmpty()){
			for(int j=0;j<list.size();j++){
				if(first){
					first=false;
				}else{
					result.append(",");
				}
				result.append(list.get(j));
			}
		}
		String propertyowner = result.toString();
		Mortgage mort = new Mortgage();
		try {
			Util.transferFields(req, mort);
			mort.setPropertyowner(propertyowner);
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		Image image = new Image();
		String[] imageurls = req.getCertificateurl().split(",");
		for(int i=0;i<imageurls.length;i++){
			String imageurl = imageurls[i];
			String id = Util.getID();
			String savetype = "3";
			image.setImageid(id);
			image.setImagename(imageurl);
			image.setImagetype(savetype);
			image.setNodeid(req.getNodeid());
			image.setWorkid(req.getWorkid());
			image.setChgdt(new Date());
			imageMapper.insertSelective(image);
		}
		mort.setId(Util.getID());
		mortgageMapper.insertSelective(mort);
		
	}
	
	@Override
	public List<Mortgage> queryMortgageByWorkid(WorkidRequest req) {
		MortgageExample  example = new MortgageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		List<Mortgage> list = mortgageMapper.selectByExample(example);
		return list;
	}
	@Override
	public void deleteMortgage(IdRequest req) {
		mortgageMapper.deleteByPrimaryKey(req.getId());
		
	}
	/*@Override
	public List<Mortgage> queryAllMortgage(int pagenum, int pagesize) {
		List<Mortgage> page = mortgageExMapper.findAll(pageable);
		return page;
	}*/
	@Override
	public List<Mortgage> queryAllMortgage() {
		MortgageExample example = new MortgageExample();
		return mortgageMapper.selectByExample(example);
	}
	@Override
	public Mortgage selectByMortgageid(String mortgageid) {
		
		return mortgageMapper.selectByPrimaryKey(mortgageid);
	}
	@Override
	public List<Mortgage> queryMortgageByWorkidAndCerdid(WorkidAndCerdidRequest req) {
		MortgageExample  example = new MortgageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andPropertyownerLike("%"+req.getCerdid()+"%");
		List<Mortgage> list = mortgageMapper.selectByExample(example);
		return list;
	}
	@Override
	public void insertMortgage(Mortgage req) {
		mortgageMapper.insertSelective(req) ;
	}
	

}
