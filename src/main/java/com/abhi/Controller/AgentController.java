package com.abhi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.DAO.AgentDAO;
import com.abhi.entity.Agent;
@Controller
public class AgentController {
	@Autowired
	AgentDAO ag;
	@RequestMapping("/addagent")
	@ResponseBody
	//Add agent details
	public String addAgent(Agent a) {
		try {
		ag.save(a);
		return "AGENT ADDED";
		}
		catch(Exception e)
		{
			return e.toString();
		}
	}
	@RequestMapping("/viewagent")
	@ResponseBody
	//View agent details
	public String viewAgent(String id) {
		try {
		List<Agent>list=ag.findAll();
		for(Agent a:list) {
			if(a.getId().equals(id)) {
				return a.toString();
			}
		}}catch(Exception e)
		{
			System.out.println(e);
		}
		return "NO AGENT FOUND";
	}
	@RequestMapping("/viewallagent")
	@ResponseBody
	public String viewAllAgent() {
		List<Agent>list=ag.findAll();
		return list.toString();
	}
	@RequestMapping("/updateagent")
	@ResponseBody
	//update agent details
	public String updateAgent(Agent a1) {
	try {	List<Agent>list=ag.findAll();
		for(Agent a:list) {
			if(a.getId().equals(a.getId())) {
				ag.delete(a);
				break;
			}
		}
		ag.save(a1);
	}
	catch(Exception e) {
		System.out.println(e);
	}
		return "AGENT UPDATED";
	}
	@RequestMapping("/deleteagent")
	@ResponseBody
	//Delete agent details
	public String deleteAgent(String id) {
	try {	List<Agent>list=ag.findAll();
		for(Agent a:list) {
			if(a.getId().equals(id)) {
				ag.delete(a);
				return "AGENT DELETED";
			}
		}}
	catch(Exception e) {
		
		System.out.println(e);
	}
				return "AGENT NOT AVAILABLE";
			}
		}


