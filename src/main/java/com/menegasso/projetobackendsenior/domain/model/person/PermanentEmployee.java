package com.menegasso.projetobackendsenior.domain.model.person;

import com.menegasso.projetobackendsenior.domain.model.address.Address;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Represents a permanent employee with its specific attributes.
 * This class extends Person to reflect an inheritance relationship,
 * remaining free of any framework-specific annotations. (Clean Architecture).
 */
public class PermanentEmployee extends Person {

    private String registration;

    public PermanentEmployee() {
        super();
    }

    public PermanentEmployee(
            Long id,
            String name,
            LocalDate birthDate,
            String motherName,
            String fatherName,
            Gender gender,
            List<Address> addresses,
            List<PersonPhoto> photos,
            String registration
    ) {
        super(id, name, birthDate, motherName, fatherName, gender, addresses, photos);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermanentEmployee)) return false;
        if (!super.equals(o)) return false;
        PermanentEmployee that = (PermanentEmployee) o;
        return Objects.equals(registration, that.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registration);
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "registration='" + registration + '\'' +
                ", person=" + super.toString() +
                '}';
    }
}
