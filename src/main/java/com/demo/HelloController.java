package com.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        StringBuilder message = new StringBuilder("Hello Google App Engine!");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
    
    @GetMapping("/newPage")
	public String getPage(Model model) {
    	StringBuilder message = new StringBuilder("Hello,welcome to spring boot application!");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
	}
    
    @RequestMapping("/newPage1")
	public String getPage1(Model model) {
		String message = "Hi welcome to Spring boot application";
		model.addAttribute("message", message);
		return "newPage";
	}

}
