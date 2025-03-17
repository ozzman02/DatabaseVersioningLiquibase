package com.ossant.dogdating.controller;

import com.ossant.dogdating.dto.NewProfileRequestDto;
import com.ossant.dogdating.service.ProfileService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<?> createProfile(NewProfileRequestDto newProfileRequestDto) {
        profileService.addProfile(newProfileRequestDto);
        return ResponseEntity.ok().build();
    }

}

