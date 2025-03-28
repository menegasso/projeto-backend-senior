package com.menegasso.projetobackendsenior.application.dto.person;

import com.menegasso.projetobackendsenior.domain.model.person.Gender;
import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a TemporaryEmployee Data Transfer Object.
 * This class extends PersonDTO to include attributes specific to temporary employees,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class TemporaryEmployeeDTO extends PersonDTO {

    private LocalDate hireDate;
    private LocalDate terminationDate;

    public TemporaryEmployeeDTO() {
        super();
    }

    public TemporaryEmployeeDTO(Long id, String name, LocalDate birthDate, String motherName, String fatherName,
                                Gender gender, List<AddressDTO> addresses, List<PersonPhotoDTO> photos,
                                LocalDate hireDate, LocalDate terminationDate) {
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
}
