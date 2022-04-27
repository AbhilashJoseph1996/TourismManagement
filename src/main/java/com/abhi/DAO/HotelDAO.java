package com.abhi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Hotel;

public interface HotelDAO extends JpaRepository<Hotel,Integer>{

}
