package com.ossant.dogdating.dto;

import com.ossant.dogdating.entity.Profile;

public class ProfileDto {

    private String name;

    private String gender;

    private Integer height;

    private Integer weight;

    private String description;

    private String image;

    private String breed;

    public static ProfileDto from(Profile profile) {
        String breed = profile.getBreed() != null ? profile.getBreed().getName() : null;
        return new ProfileDto(profile.getName(), profile.getHeight(), profile.getWeight(),
                profile.getDescription(), profile.getImageUrl(), breed, profile.getGender());
    }

    private ProfileDto(String name, Integer height, Integer weight, String description,
                       String image, String breed, Character gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.description = description;
        this.image = image;
        this.breed = breed;
        if (gender != null) {
            switch (gender) {
                case 'M':
                    this.gender = "male";
                    break;
                case 'F':
                    this.gender = "female";
                    break;
                default:
                    this.gender = "";
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
