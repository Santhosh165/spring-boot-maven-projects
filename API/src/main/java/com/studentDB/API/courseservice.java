package com.studentDB.API;

import java.util.List;



public interface courseservice {
	public String upsert(Course course);
	public Course getById(Integer cid);
	public List<Course> getAllCourse();
	public String delectById(Integer cid);

}
