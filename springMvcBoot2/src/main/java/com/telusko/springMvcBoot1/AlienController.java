package com.telusko.springMvcBoot1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springMvcBoot1.model.Alien;

@RestController 
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens", produces = {"application/xml"})  // this produces will receive data in xml format only and if server try to get data in json format, it will get 406 Not acceptable error
	//@ResponseBody      This is commented as instead of @Controller annotation we have mentioned @RestController for this class that include @ResponseBody
	public List<Alien> getAliens() {
		
		List<Alien> aliens = repo.findAll();
		
		System.out.println("fetching aliens");
		
		return aliens;
	}
	
	@GetMapping("alien/{aid}")
	//@ResponseBody
	public Alien getAlien(@PathVariable("aid") int aid) {
	
	Alien alien = repo.findById(aid).orElse(new Alien(0,""));
	return alien;
	}
	
	@PostMapping(path ="alien" , consumes= {"application/json"})  // Consumes tell that this method will only accept json data
	public Alien addAlien(@RequestBody Alien alien) {   // @RequestBody annotation will convert JSON data into Java data 
		
		repo.save(alien);
		
		return alien;
	}
}
