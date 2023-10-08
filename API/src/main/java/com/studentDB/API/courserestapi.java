package com.studentDB.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courserestapi {
	@Autowired
	private courseservice CourseService;
	
	
	@PostMapping("/Course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = CourseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
		
	}
	@GetMapping("/Course/{cid}")
	public ResponseEntity<Course>  getCourse(@PathVariable Integer cid){
		Course course = CourseService.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
		
	}
	
	@GetMapping("/Courses")
	public ResponseEntity<List<Course>> getAllCourse(){
		List<Course> allcourse = CourseService.getAllCourse();
		return new ResponseEntity<>(allcourse, HttpStatus.OK);
		
	}
	@PutMapping("/Course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = CourseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	}
	@DeleteMapping("/Course/{cid}")
	public ResponseEntity<Course>  deleteCourseById(@PathVariable Integer cid){
		Course status = CourseService.getById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	}

}
