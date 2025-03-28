package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.AddressMapper;
import com.menegasso.projetobackendsenior.domain.model.address.Address;
import com.menegasso.projetobackendsenior.domain.repository.address.AddressRepository;

/**
 * Use case for creating an Address.
 * Defines the business operation for persisting a new Address,
 * converting between the domain model and AddressDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreateAddressUseCase {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public CreateAddressUseCase(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    public AddressDTO execute(AddressDTO addressDTO) {
        Address address = addressMapper.toDomain(addressDTO);
        Address savedAddress = addressRepository.save(address);
        return addressMapper.toDTO(savedAddress);
    }
}
