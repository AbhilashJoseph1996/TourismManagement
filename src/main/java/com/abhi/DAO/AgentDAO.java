package com.abhi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Agent;

	public interface AgentDAO extends JpaRepository<Agent,Integer>{
		
}
