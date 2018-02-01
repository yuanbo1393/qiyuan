package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;


import com.example.demo.BodyRepository;

@RestController
public class QueryController{
	@Autowired
	private BodyRepository bodyRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(QueryController.class);
	
	@RequestMapping(path="/Query",method=RequestMethod.GET)
	public Body showData(@RequestParam(value="keyword") String keyword) {
		Body body = bodyRepository.findByNum(keyword);
		//logger.info(body.getName());
		return body;
	}
	
	@RequestMapping(path="/queryBasic",method=RequestMethod.GET)
	public Basic showBasic(@RequestParam(value="keyword") String keyword) {
		Body body = bodyRepository.findByNum(keyword);
		if(body==null)
		{
			return null;
		}
		Basic basic = body.getBasic();
		logger.info(basic.getName());
		return basic;
	}
	
	@RequestMapping(path="/queryODP",method=RequestMethod.GET)
	public List<OrbitDeterminationParameter> showODP(@RequestParam(value="keyword") String keyword) {
		Body body = bodyRepository.findByNum(keyword);
		if(body==null)
		{
			return null;
		}
		List<OrbitDeterminationParameter> list_ODP = new ArrayList<OrbitDeterminationParameter>();
		for(int i=1;i<14;i++) {
			OrbitDeterminationParameter odp = body.getODP(i);
			list_ODP.add(odp);
			logger.info(odp.toString());
		}
		return list_ODP;
	}
	
	@RequestMapping(path="/queryOE",method=RequestMethod.GET)
	public List<OrbitalElement> showOE(@RequestParam(value="keyword") String keyword) {
		Body body = bodyRepository.findByNum(keyword);
		if(body==null)
		{
			return null;
		}
		List<OrbitalElement> list_OE=new ArrayList<OrbitalElement>();
		for(int i=1;i<13;i++) {
			OrbitalElement oe = body.getOE(i);
			list_OE.add(oe);
		}
		return list_OE;
	}
	
	@RequestMapping(path="/queryPP",method=RequestMethod.GET)
	public List<PhysicalParameter> showPP(@RequestParam(value="keyword") String keyword) {
		Body body = bodyRepository.findByNum(keyword);
		if(body==null)
		{
			return null;
		}
		List<PhysicalParameter> list_PP = new ArrayList<PhysicalParameter>();
		for(int i=1;i<13;i++) {
			PhysicalParameter pp = body.getPP(i);
			list_PP.add(pp);
		}
		return list_PP;
	}
}