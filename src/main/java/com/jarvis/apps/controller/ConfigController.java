package com.jarvis.apps.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api("/config")
@RestController
@RequestMapping("/config")
public class ConfigController {
		
	   //http://ip:port/jarvis/config/path
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getConfigValue(@PathVariable String name) {
		return name + "=testvalue";
	}
	
	
	   //http://ip:port/jarvis/config/list
 /* @RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody String getConfigList() {
		return "[path=testvalue]"; 
	}*/
	
}
