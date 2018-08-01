package com.pankaj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/api"})
public class TestController {

	@RequestMapping("/title")
	public String getTitle(){
		return "Angular Application";
	}
}
