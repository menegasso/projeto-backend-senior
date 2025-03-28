package com.menegasso.projetobackendsenior.application.dto.person;

import com.menegasso.projetobackendsenior.domain.model.person.Gender;
import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a Person Data Transfer Object with basic attributes.
 * This class is part of the application layer and is used to transfer
 * Person data between the domain model and external layers,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class PersonDTO {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private Gender gender;
    private List<AddressDTO> addresses;
    private List<PersonPhotoDTO> photos;

    public PersonDTO() {
    }

    public PersonDTO(Long id, String name, LocalDate birthDate, String motherName, String fatherName, Gender gender, List<AddressDTO> addresses, List<PersonPhotoDTO> photos) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.addresses = addresses;
        this.photos = photos;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public List<PersonPhotoDTO> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PersonPhotoDTO> photos) {
        this.photos = photos;
    }
}
