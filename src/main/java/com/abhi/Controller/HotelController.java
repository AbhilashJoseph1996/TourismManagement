package com.abhi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abhi.DAO.HotelDAO;
import com.abhi.entity.Hotel;
@Controller
public class HotelController {
	@Autowired
	HotelDAO ho;
	@RequestMapping("/addhotel")
	@ResponseBody
	//Add hotel details
	public String addHotel(Hotel h) {
		try {ho.save(h);
		return "HOTEL ADDED";
	}
	catch(Exception e)
	{
		return e.toString();
	}}
	@RequestMapping("/viewhotel")
	@ResponseBody
	//View hotel details
	public String viewHotel(String hotelNo) {
	try {	List<Hotel>list=ho.findAll();
		for(Hotel h:list) {
			if(h.getHotelNo().equals(hotelNo)) {
				return h.toString();
			}
		}}
	catch(Exception e) {
		System.out.println(e);
		}
		return "NO HOTEL FOUND";
	}
	@RequestMapping("/viewallhotel")
	@ResponseBody
	public String viewAllHotel() {
		List<Hotel>list=ho.findAll();
		return list.toString();
	}
	@RequestMapping("/updatehotel")
	@ResponseBody
	//Update hotel details
	public String updateHotel(Hotel h1) {
		try{List<Hotel>list=ho.findAll();
		for(Hotel h:list) {
			if(h.getHotelNo().equals(h.getHotelNo())) {
				ho.delete(h);
				break;
			}
		}
		ho.save(h1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "HOTEL UPDATED";
	}
	@RequestMapping("/deletehotel")
	@ResponseBody
	//Delete hotel details
	public String deleteHotel(String hotelNo) {
		try{List<Hotel>list=ho.findAll();
		for(Hotel h:list) {
			if(h.getHotelNo().equals(hotelNo)) {
				ho.delete(h);
				return "HOTEL DELETED";
			}
		}}
		catch(Exception e) {
			System.out.println(e);
		}
				return "HOTEL NOT AVAILABLE";
			}
		}

