package com.codingdojo.dojoAndNinjas.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.codingdojo.dojoAndNinjas.models.Ninja;
import com.codingdojo.dojoAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	public final NinjaRepository ninjaRepo;

	public NinjaService (NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	 // returns all the Ninja
	 public List<Ninja> allNinjas() {
	     return ninjaRepo.findAll();
	 }
	 // creates a Ninja
	 @SuppressWarnings("unchecked")
	public Ninja createNinja(Ninja n) {
	     return (Ninja) ninjaRepo.save(n);
	 }
	 // retrieves a Expense
	 public Ninja findNinja(Long id) {
	     Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
	     if(optionalNinja.isPresent()) {
	         return optionalNinja.get();
	     } else {
	         return null;
	     }
	 }
	 // updates a Ninja
	 @SuppressWarnings("unchecked")
	public Object updateNinja(Ninja n) {
		 return ninjaRepo.save(n);
	 }
	 @SuppressWarnings("unchecked")
	public void deleteNinja(Ninja n) { 
		 ninjaRepo.save(n);
	 }
}