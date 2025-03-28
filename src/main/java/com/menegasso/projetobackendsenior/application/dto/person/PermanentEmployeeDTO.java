package com.menegasso.projetobackendsenior.application.dto.person;

import com.menegasso.projetobackendsenior.domain.model.person.Gender;
import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a PermanentEmployee Data Transfer Object.
 * This class extends PersonDTO to include attributes specific to permanent employees,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class PermanentEmployeeDTO extends PersonDTO {

    private String registration;

    public PermanentEmployeeDTO() {
        super();
    }

    public PermanentEmployeeDTO(Long id, String name, LocalDate birthDate, String motherName, String fatherName,
                                Gender gender, List<AddressDTO> addresses, List<PersonPhotoDTO> photos,
                                String registration) {
        super(id, name, birthDate, motherName, fatherName, gender, addresses, photos);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
