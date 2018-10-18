package com.example.salarier;

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
public class SalarierResource {

	@Autowired
	private SalarierRepository salarierRepository;

	@GetMapping("/salariers")
	public List<Salarier> retrieveAllSalarier() {
		return salarierRepository.findAll();
	}

	@GetMapping("/salariers/{id}")
	public Salarier retrieveSalarier(@PathVariable long id) {
		Optional<Salarier> salarier = salarierRepository.findById(id);

		if (!salarier.isPresent())
			throw new SalarierNotFoundException("id-" + id);

		return salarier.get();
	}

	@DeleteMapping("/salariers/{id}")
	public void deleteStudent(@PathVariable long id) {
		salarierRepository.deleteById(id);
	}

	@PostMapping("/salariers")
	public ResponseEntity<Object> createSalarier(@RequestBody Salarier salarier) {
		Salarier savedSalarier = salarierRepository.save(salarier);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedSalarier.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@PutMapping("/salariers/{id}")
	public ResponseEntity<Object> updateSalarier(@RequestBody Salarier salarier, @PathVariable long id) {

	/*	Optional<Salarier> salarierOptional salarierRepository.findById(id);

		if (!salarierOptional.isPresent())
			return ResponseEntity.notFound().build();

		salarier.setId(id);
		
		salarierRepository.save(salarier);*/

		return ResponseEntity.noContent().build();
	}

}
