package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParam {
	@GetMapping("/details/{name}/{course}")
	public String hello(@PathVariable("name") String n,@PathVariable("course")String c,Map<String,Object> model) {
		String msg = "welcome "+n+" for "+c;
		model.put("message", msg);
		return "index";
	}

}
