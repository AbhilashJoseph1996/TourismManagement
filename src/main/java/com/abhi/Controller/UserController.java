package com.abhi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.DAO.UserDAO;
import com.abhi.entity.User;

@Controller
public class UserController {
@Autowired
UserDAO us;
@RequestMapping("/home")
public String show() {
	return "home.jsp";
}
@RequestMapping("/adduser")
@ResponseBody
//Add user details
public String addUser(User u) {
	try{
		us.save(u);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return "USER ADDED";
}
@RequestMapping("/viewuser")
@ResponseBody
//View user details
public String viewUser(int id) {
	try{
		List<User>list=us.findAll();
	for(User u:list) {
		if(u.getId()==id) {
			return u.toString();
		}
	}}
	catch(Exception e) {
		System.out.println(e);
	}
	return "NO USER FOUND";
}
@RequestMapping("/viewalluser")
@ResponseBody
public String viewAllUser() {
	List<User>list=us.findAll();
	return list.toString();
}
@RequestMapping("/updateuser")
@ResponseBody
//Update user details
public String updateUser(User u1) {
	try{
		List<User>list=us.findAll();
	for(User u:list) {
		if(u.getId()==u1.getId()) {
			us.delete(u);
			break;
		}
	}
	us.save(u1);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return "USER UPDATED";
}
@RequestMapping("/deleteuser")
@ResponseBody
//Delete User details
public String deleteUser(int id) {
	try{
		List<User>list=us.findAll();
	for(User u:list) {
		if(u.getId()==id) {
			us.delete(u);
			return "USER DELETED";
		}
	}}
	catch(Exception e) {
		System.out.println(e);
	}
			return "USER NOT AVAILABLE";
		}
	}


