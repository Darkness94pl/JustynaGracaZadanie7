package com.howtodoinjava.controller;

import com.howtodoinjava.entity.UslugiEntity;
import com.howtodoinjava.service.UslugiManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.howtodoinjava.entity.UslugiEntity;
import com.howtodoinjava.service.UslugiManager;

@Controller
public class ClientController {
	
	@Autowired
	private UslugiManager uslugiManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listUslugi(ModelMap map)
	{
		map.addAttribute("uslugi", new UslugiEntity());
		map.addAttribute("uslugiList", uslugiManager.getAllUslugi());
		
		return "uslugiList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUslugi(@ModelAttribute(value="uslugi") UslugiEntity uslugi, BindingResult result)
	{
		uslugiManager.addUslugi(uslugi);
		return "redirect:/";
	}

	@RequestMapping("/delete/{uslugiId}")
	public String deleteUslugi(@PathVariable("uslugiId") Integer uslugiId)
	{
		uslugiManager.deleteUslugi(uslugiId);
		return "redirect:/";
	}

	public void setUslugiManager(UslugiManager uslugiManager) {
		this.uslugiManager = uslugiManager;
	}
}
