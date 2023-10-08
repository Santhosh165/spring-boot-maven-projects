package com.studentDB.API;

import org.springframework.data.annotation.Id;



public class Course {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String name;
	private Double price;
	
	public Course(Integer id, String name, Double price) {
		super();
		this.cid = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return cid;
	}
	public void setId(Integer id) {
		this.cid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
