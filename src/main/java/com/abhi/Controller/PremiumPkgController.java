package com.abhi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.DAO.PpackageDAO;
import com.abhi.entity.Ppackage;
@Controller
public class PremiumPkgController {
	@Autowired
	PpackageDAO pp;
	@RequestMapping("/addpremiumpkg")
	@ResponseBody
	//Add premium package details
	public String addpackage(Ppackage p) {
	try {
		pp.save(p);
	}
	catch(Exception e) {
		System.out.println(e);
	}
		return "PACKAGE ADDED";
	}
	@RequestMapping("/viewpremiumpkg")
	@ResponseBody
	//View premium package details
	public String viewpackage(String pkgNo) {
	try {
		List<Ppackage>list=pp.findAll();
		for(Ppackage p:list) {
			if(p.getPkgNo().equals(pkgNo)) {
				return p.toString();
			}
		}}
	catch(Exception e) {
		System.out.println(e);
	}
		return "NO PACKAGE FOUND";
	}
	@RequestMapping("/viewallpkg")
	@ResponseBody
	public String viewAllpackage() {
		List<Ppackage>list=pp.findAll();
		return list.toString();
	}
	@RequestMapping("/updatepremiumpkg")
	@ResponseBody
	//Update premium package details
	public String updatepackage(Ppackage n1) {
		try{
			List<Ppackage>list=pp.findAll();
		for(Ppackage p:list) {
			if(p.getPkgNo().equals(n1.getPkgNo())) {
				pp.delete(p);
				break;
			}
		}
		pp.save(n1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return " PACKAGE UPDATED";
	}
	@RequestMapping("/deletepremiumpkg")
	@ResponseBody
	//Delete premium package details
	public String deletepackage(String pkgNo) {
	try {	List<Ppackage>list=pp.findAll();
		for(Ppackage p:list) {
			if(p.getPkgNo().equals(pkgNo)) {
				pp.delete(p);
				return "PACKAGE DELETED";
			}
		}}
	catch(Exception e) {
		System.out.println(e);
	}
				return "PACKAGE NOT AVAILABLE";
			}
}
