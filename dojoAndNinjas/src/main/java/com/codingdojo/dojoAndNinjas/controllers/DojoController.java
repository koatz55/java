package com.codingdojo.dojoAndNinjas.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoAndNinjas.models.Dojo;
import com.codingdojo.dojoAndNinjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	DojoService dojoService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/dojo";
	}
	
	@GetMapping("/dojo")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@PostMapping("/dojo")
	public String index(@Valid @ModelAttribute("Dojo")Dojo dojo, Model model,  BindingResult result) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "index.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/dojo";
		}
	}
	
	
	
	
}
