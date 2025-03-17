package com.ossant.dogdating.repository;

import com.ossant.dogdating.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
