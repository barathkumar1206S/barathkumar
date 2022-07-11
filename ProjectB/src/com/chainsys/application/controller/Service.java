package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@RequestMapping("/welcome")
 public String welcomePage() 
{ 
return "<h1>Welcome</h1>";
}

	@RequestMapping("/home")
 public String homePage() {
String html="<div>Spring is a lightweight framework."
+ "It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF, etc.</div>";
return html; 
}

	@RequestMapping("/getData")
public String getData(@RequestParam(value="city",defaultValue="Madurai")String city) {
 return "<h1>Welcome to Temple city "+city+"</h1>";
 }
}
