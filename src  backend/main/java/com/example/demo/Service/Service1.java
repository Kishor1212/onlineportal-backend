package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.model1;
import com.example.demo.Repo.Repo1;
@Service

public class Service1 {
	@Autowired
	
	Repo1 Erepo1;
	public String Details(model1 ee) {
		Erepo1.save(ee);
		return "Data added";
	}
	public String upDetails(model1 ee) {
		Erepo1.saveAndFlush(ee);
		return "Data updated";
	}
	
	public String delDetails(int id) {
		Erepo1.deleteById(id);
		return "data Deleted";
	}
	public List<model1> displayDetails() {
			return Erepo1.findAll();
	}

}
