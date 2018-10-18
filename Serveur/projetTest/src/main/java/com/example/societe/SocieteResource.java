package com.example.societe;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class SocieteResource {

	@Autowired
	private SocieteRepository societeRepository;

	@GetMapping("/salariers")
	public List<Societe> retrieveAllSalarier() {
		return societeRepository.findAll();
	}

	@GetMapping("/societes/{id}")
	public Societe retrieveSociete(@PathVariable long id) {
		Optional<Societe> societe = societeRepository.findById(id);

		if (!societe.isPresent())
			throw new SocieteNotFoundException("id-" + id);

		return societe.get();
	}

	@DeleteMapping("/societes/{id}")
	public void deleteSociete(@PathVariable long id) {
		societeRepository.deleteById(id);
	}

	@PostMapping("/societes")
	public ResponseEntity<Object> createSociete(@RequestBody Societe societe) {
		Societe savedSociete = societeRepository.save(societe);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedSociete.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@PutMapping("/societes/{id}")
	public ResponseEntity<Object> updateSociete(@RequestBody Societe societe, @PathVariable long id) {

		/*
		 * Optional<Societe> societeOptional societeRepository.findById(id);
		 * 
		 * if (!societeOptional.isPresent()) return ResponseEntity.notFound().build();
		 * 
		 * societe.setId(id);
		 * 
		 * societeRepository.save(societe);
		 */

		return ResponseEntity.noContent().build();
	}

}
