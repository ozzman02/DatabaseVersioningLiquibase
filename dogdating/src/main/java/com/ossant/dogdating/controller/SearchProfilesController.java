package com.ossant.dogdating.controller;

import com.ossant.dogdating.dto.ProfileDto;
import com.ossant.dogdating.repository.ProfileRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profiles")
public class SearchProfilesController {

    private final ProfileRepository profileRepository;

    public SearchProfilesController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping
    public ResponseEntity<?> getMainPage() {
        return new ResponseEntity<>(profileRepository.findAll()
                .stream()
                .map(ProfileDto::from)
                .toList(), HttpStatus.OK);
    }
}
