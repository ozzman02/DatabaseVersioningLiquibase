package com.dbapresents.datingplatform.breed;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "BREEDS")
public class Breed {

    @Id
    @GeneratedValue
    @Column(name = "BRE_ID")
    private Long id;

    @Column(name = "BRE_NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
