package com.ossant.dogdating.controller;

import com.ossant.dogdating.repository.BreedRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/breeds")
public class BreedController {

    private final BreedRepository breedRepository;

    public BreedController(BreedRepository breedRepository) {
        this.breedRepository = breedRepository;
    }

    @GetMapping
    public ResponseEntity<?> getBreeds() {
        return new ResponseEntity<>(breedRepository.findAll(), HttpStatus.OK);
    }

}
