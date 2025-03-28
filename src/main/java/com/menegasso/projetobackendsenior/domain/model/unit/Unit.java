package com.menegasso.projetobackendsenior.domain.model.unit;

import com.menegasso.projetobackendsenior.domain.model.address.Address;

import java.util.List;
import java.util.Objects;

/**
 * Represents a unit (unidade) with its basic attributes,
 * remaining free of any framework-specific annotations. (Clean Architecture).
 */
public class Unit {

    private Long id;
    private String name;
    private String abbreviation;
    private List<Address> addresses;

    public Unit() {
    }

    public Unit(Long id, String name, String acronym, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.abbreviation = acronym;
        this.addresses = addresses;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equals(id, unit.id)
                && Objects.equals(name, unit.name)
                && Objects.equals(abbreviation, unit.abbreviation)
                && Objects.equals(addresses, unit.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, abbreviation, addresses);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acronym='" + abbreviation + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
