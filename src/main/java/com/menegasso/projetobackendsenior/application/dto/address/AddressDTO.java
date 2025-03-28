package com.menegasso.projetobackendsenior.application.dto.address;

/**
 * Represents an Address Data Transfer Object with basic attributes.
 * This class is part of the application layer and is used to transfer
 * Address data between the domain model and external layers,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class AddressDTO {
    private Long id;
    private String streetType;
    private String street;
    private Integer number;
    private String neighborhood;
    private CityDTO city;

    public AddressDTO() {
    }

    public AddressDTO(Long id, String streetType, String street, Integer number, String neighborhood, CityDTO city) {
        this.id = id;
        this.streetType = streetType;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }
}
