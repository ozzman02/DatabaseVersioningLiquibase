package com.ossant.dogdating.service;

import com.ossant.dogdating.dto.NewProfileRequestDto;
import com.ossant.dogdating.entity.Profile;
import com.ossant.dogdating.repository.BreedRepository;
import com.ossant.dogdating.repository.ProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    private final BreedRepository breedRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository, BreedRepository breedRepository) {
        this.profileRepository = profileRepository;
        this.breedRepository = breedRepository;
    }

    @Override
    public void addProfile(NewProfileRequestDto newProfileRequest) {
        Profile profile = new Profile();
        profile.setName(newProfileRequest.getName());
        profile.setHeight(newProfileRequest.getHeight());
        profile.setWeight(newProfileRequest.getWeight());
        profile.setDescription(newProfileRequest.getDescription());
        profile.setImageUrl("/img/sample.jpg");
        if (newProfileRequest.getBreedId() != null) {
            profile.setBreed(breedRepository.findById(newProfileRequest.getBreedId())
                    .orElse(null));
        }
        profile.setGender(newProfileRequest.getGender());
        profileRepository.save(profile);
    }
}
