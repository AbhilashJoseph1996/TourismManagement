package com.abhi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.DAO.NpackageDAO;
import com.abhi.entity.Npackage;


@Controller
public class NormalPkgController {
	@Autowired
	NpackageDAO np;
	@RequestMapping("/addnormalpkg")
	@ResponseBody
	//Add normal package details
	public String addpackage(Npackage n) {
		try{
			np.save(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "PACKAGE ADDED";
	}
	@RequestMapping("/viewnormalpkg")
	@ResponseBody
	//View normal package details
	public String viewpackage(String pkgNo) {
		try{List<Npackage>list=np.findAll();
		for(Npackage n:list) {
			if(n.getPkgNo().equals(pkgNo)) {
				return n.toString();
			}
		}}
		catch(Exception e) {
			System.out.println(e);
		}
		return "NO PACKAGE FOUND";
	}
	@RequestMapping("/viewall")
	@ResponseBody
	public String viewAllpackage() {
		List<Npackage>list=np.findAll();
		return list.toString();
	}
	@RequestMapping("/updatenormalpkg")
	@ResponseBody
	//Update normal package details
	public String updatepackage(Npackage n1) {
		try{
			List<Npackage>list=np.findAll();
		
		for(Npackage n:list) {
			if(n.getPkgNo().equals(n1.getPkgNo())) {
				np.delete(n);
				break;
			}
		}
		np.save(n1);
	}
		catch(Exception e) {
			System.out.println(e);
		}
		return " PACKAGE UPDATED";
	}
	@RequestMapping("/deletenormalpkg")
	@ResponseBody
	//Delete normal package details
	public String deletepackage(String pkgNo) {
	try {	List<Npackage>list=np.findAll();
		for(Npackage n:list) {
			if(n.getPkgNo().equals(pkgNo)) {
				np.delete(n);
				return "PACKAGE DELETED";
			}
		}}
	catch(Exception e) {
		System.out.println(e);
	}
				return "AGENT NOT AVAILABLE";
			}
		}


