package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

//import com.example.demo.Entity.model;
import com.example.demo.Entity.model1;
import com.example.demo.Service.Service1;

@CrossOrigin
@RestController
public class Controller1 {
	@Autowired
	Service1 Eservice1;
	
	@GetMapping("/displayDetails")
	public List<model1> show() {
		return Eservice1.displayDetails();
	}
	
	@PutMapping("/upDetails")
	public String update(@RequestBody model1 ee) {
		return Eservice1.upDetails(ee);
	}
	
	@DeleteMapping("/delDetails/{eid}")
	public String delete(@PathVariable("eid") int id) {
		return Eservice1.delDetails(id);
	}
	
	@PostMapping("/Details")
	public String add(@RequestBody model1 ee) {
		return Eservice1.Details(ee);
		
	}

}
