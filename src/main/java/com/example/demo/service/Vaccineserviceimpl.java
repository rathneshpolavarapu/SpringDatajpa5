package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.ResultView.ResultView;
import com.example.demo.model.Vaccine;
import com.example.demo.repo.Vaccinerepo;

@Service
public class Vaccineserviceimpl implements Vaccineservice {

	@Autowired
	private Vaccinerepo repo;

	@Override
	public List<ResultView> fetchByCostLessthan(Double cost) {
		// TODO Auto-generated method stub
		return repo.findByCostLessThan(cost);
	}

	

	
	
		
	}
	

	


