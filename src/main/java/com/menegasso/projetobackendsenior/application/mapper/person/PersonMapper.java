package com.menegasso.projetobackendsenior.application.mapper.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.AddressMapper;
import com.menegasso.projetobackendsenior.domain.model.person.Person;
import org.mapstruct.Mapper;

/**
 * Mapper interface for Person.
 * Defines the contract for converting between Person domain objects and PersonDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = { AddressMapper.class, PersonPhotoMapper.class })
public interface PersonMapper {
    PersonDTO toDTO(Person person);
    Person toDomain(PersonDTO personDTO);
}
