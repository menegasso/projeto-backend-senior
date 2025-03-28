package com.menegasso.projetobackendsenior.domain.model.person;

import com.menegasso.projetobackendsenior.domain.model.address.Address;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Represents a person with basic attributes.
 * This class is part of the domain model and should remain free
 * of any framework-specific annotations. (Clean Architecture).
 */
public class Person {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String motherName;
    private String fatherName;
    private Gender gender;
    private List<Address> addresses;
    private List<PersonPhoto> photos;

    public Person() {
    }

    public Person(Long id, String name, LocalDate birthDate, String motherName, String fatherName, Gender gender, List<Address> addresses, List<PersonPhoto> photos) {
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PersonPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PersonPhoto> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate) && Objects.equals(motherName, person.motherName) && Objects.equals(fatherName, person.fatherName) && gender == person.gender && Objects.equals(addresses, person.addresses) && Objects.equals(photos, person.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, motherName, fatherName, gender, addresses, photos);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", gender=" + gender +
                ", addresses=" + addresses +
                ", photos=" + photos +
                '}';
    }
}
