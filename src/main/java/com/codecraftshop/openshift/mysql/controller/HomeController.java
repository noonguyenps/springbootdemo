package com.codecraftshop.openshift.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecraftshop.openshift.mysql.model.Student;
import com.codecraftshop.openshift.mysql.repository.StudentRepository;

@RestController
public class HomeController {
	
	@RequestMapping(value="/home")
	public String init(){
		return "This is home page";
	}
}