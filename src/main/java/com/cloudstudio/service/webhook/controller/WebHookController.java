package com.cloudstudio.service.webhook.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/webhook")
public class WebHookController {
	
	
@RequestMapping(value="/hook",method = RequestMethod.POST)	
public String getMessage(@RequestParam(name = "env") String env) {
	
	
	return "hello from webhook"+env;
	
}
	


}
