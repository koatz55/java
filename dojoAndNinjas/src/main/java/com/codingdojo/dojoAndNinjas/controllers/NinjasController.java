package com.codingdojo.dojoAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoAndNinjas.models.Dojo;
import com.codingdojo.dojoAndNinjas.models.Ninja;
import com.codingdojo.dojoAndNinjas.services.DojoService;
import com.codingdojo.dojoAndNinjas.services.NinjaService;

@Controller
public class NinjasController {
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	@GetMapping("/newNinja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = this.dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "NewNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String created(@ModelAttribute("ninja")Ninja ninja) {
		ninja = ninjaService.createNinja(ninja);
		return "redirect:/dojo/allNingajs/" + ninja.getDojo().getId();
	}
	
	@GetMapping("/dojo/allNingajs/{id}")
	public String ninjsInDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojoAndNinjas.jsp";
	}
	
	
}
