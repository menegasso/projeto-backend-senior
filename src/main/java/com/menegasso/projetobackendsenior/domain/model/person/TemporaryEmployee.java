package com.menegasso.projetobackendsenior.domain.model.person;

import com.menegasso.projetobackendsenior.domain.model.address.Address;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Represents a temporary employee with its specific attributes.
 * This class extends Person to reflect an inheritance relationship,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class TemporaryEmployee extends Person {

    private LocalDate hireDate;
    private LocalDate terminationDate;

    public TemporaryEmployee() {
        super();
    }

    public TemporaryEmployee(LocalDate hireDate, LocalDate terminationDate) {
        this.hireDate = hireDate;
        this.terminationDate = terminationDate;
    }

    public TemporaryEmployee(Long id, String name, LocalDate birthDate, String motherName, String fatherName, Gender gender, List<Address> addresses, List<PersonPhoto> photos, LocalDate hireDate, LocalDate terminationDate) {
        super(id, name, birthDate, motherName, fatherName, gender, addresses, photos);
        this.hireDate = hireDate;
        this.terminationDate = terminationDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TemporaryEmployee that = (TemporaryEmployee) o;
        return Objects.equals(hireDate, that.hireDate) && Objects.equals(terminationDate, that.terminationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hireDate, terminationDate);
    }

    @Override
    public String toString() {
        return "TemporaryEmployee{" +
                "hireDate=" + hireDate +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
