package com.menegasso.projetobackendsenior.application.dto.address;

/**
 * Represents a City Data Transfer Object with basic attributes.
 * This class is part of the application layer and is used to transfer
 * City data between the domain model and external layers,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class CityDTO {

    private Long id;
    private String name;
    private String stateCode;

    public CityDTO() {
    }

    public CityDTO(Long id, String name, String stateCode) {
        this.id = id;
        this.name = name;
        this.stateCode = stateCode;
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
}
