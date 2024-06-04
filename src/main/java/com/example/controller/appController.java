package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.model.account;

@Controller
public class appController {
	@Autowired
	RestTemplate rs;
	@RequestMapping("/app")
	public String getDevices()
	{
		return "index.html";
	}
	@GetMapping("/adminPage")
	public RedirectView getAdmin()
	{ 
		String redirectUrl = "http://localhost:8889/admin/login";
        return new RedirectView(redirectUrl);
		
	}
	  @GetMapping("/customerPage")
	    public RedirectView getCustomer() {
	        String redirectUrl = "http://localhost:8888/account/login";
	        return new RedirectView(redirectUrl);
	    }
}


	