package com.example.demo.service;


import java.util.List;

import com.example.demo.ResultView.ResultView;
import com.example.demo.model.Vaccine;

public interface Vaccineservice {
	
	
	public List<ResultView> fetchByCostLessthan(Double cost);
	}
