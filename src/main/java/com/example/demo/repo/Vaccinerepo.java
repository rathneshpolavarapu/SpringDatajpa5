package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ResultView.ResultView;
import com.example.demo.model.Vaccine;

public interface Vaccinerepo extends JpaRepository<Vaccine, Integer> {
	
	public List<ResultView> findByCostLessThan(Double cost); 

}
