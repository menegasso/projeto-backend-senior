package com.menegasso.projetobackendsenior.domain.model.address;

import java.util.Objects;

/**
 * Represents a city (cidade) with basic attributes,
 * remaining free of any framework-specific annotations. (Clean Architecture).
 */
public class City {

    private Long id;
    private String name;
    private String stateCode;

    public City() {
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) && Objects.equals(name, city.name) && Objects.equals(stateCode, city.stateCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stateCode);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
