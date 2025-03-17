package com.ossant.dogdating.repository;

import com.ossant.dogdating.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed, Long> {
}
