package com.codingdojo.dojoAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoAndNinjas.models.Dojo;
import com.codingdojo.dojoAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	public final DojoRepository dojoRepo;
	
	public DojoService (DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return (Dojo)dojoRepo.save(d);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
	
	public Dojo updateDojo(Dojo d) {
		return (Dojo)dojoRepo.save(d);
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
