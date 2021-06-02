package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;

@Controller
public class FormController {

	@RequestMapping(path="/form", method= RequestMethod.GET)
	public String take() {
		return "form";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String show(@ModelAttribute User user, Model model) {

		System.out.println(user);

		return "final";
	}

}

/*
  	Before using @ModleAttribute!
  
  
@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String show(@RequestParam("email") String useremail, @RequestParam("userName") String username,
		@RequestParam("password") String userpass, Model model) {

	// Some Process is here.....aage

	System.out.println("Email is: " + useremail);
	System.out.println("Name is: " + username);
	System.out.println("Pass is: " + userpass);

	// Some Process is here.....aage

	model.addAttribute("email", "useremail");
	model.addAttribute("Name", "username");
	model.addAttribute("password", "userpass");

	return "final";
	*/
