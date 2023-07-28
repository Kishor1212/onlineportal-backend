package com.example.demo.Entity;



import jakarta.persistence.*;
//import jakarta.persistence.Table;
@Table(name="raghul")
@Entity
public class model1 {
	@Id
       private String email;
       private Long password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPassword() {
		return password;
	}
	public void setPassword(Long password) {
		this.password = password;
	}
	public model1(String email, Long password) {
		super();
		this.email = email;
		this.password = password;
	}

	public model1() {
		super();
	}
	
}
