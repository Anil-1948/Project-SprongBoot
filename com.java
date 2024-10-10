package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class com {
	@Value("23")
	private int id;
	@Value("Sku-Co")
	private String name;
	@Value("Hyd")
	private String loc;
	@Autowired
	private emp ob;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public void setOb(emp ob) {
		this.ob = ob;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLoc() {
		return loc;
	}
	public void m1() {
		System.out.println(ob.getId()+" "+ob.getName()+" "+ob.getSal());
		System.out.println(getId()+" "+getName()+" "+getLoc());
	}
}
