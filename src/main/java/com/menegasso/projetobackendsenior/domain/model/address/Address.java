package com.menegasso.projetobackendsenior.domain.model.address;

import java.util.Objects;

/**
 * Represents an address with basic attributes,
 * remaining free of any framework-specific annotations. (Clean Architecture).
 */
public class Address {

    private Long id;
    private String streetType;
    private String street;
    private Integer number;
    private String neighborhood;
    private City city;

    public Address() {
    }

    public Address(Long id, String streetType, String street, Integer number, String neighborhood, City city) {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(streetType, address.streetType) && Objects.equals(street, address.street) && Objects.equals(number, address.number) && Objects.equals(neighborhood, address.neighborhood) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, streetType, street, number, neighborhood, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetType='" + streetType + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", neighborhood='" + neighborhood + '\'' +
                ", city=" + city +
                '}';
    }
}
