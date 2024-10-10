package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class emp {
	@Value("1")
	private int id;
	@Value("Anil")
	private String name;
	@Value("7588")
	private float sal;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSal() {
		return sal;
	}
}
	
