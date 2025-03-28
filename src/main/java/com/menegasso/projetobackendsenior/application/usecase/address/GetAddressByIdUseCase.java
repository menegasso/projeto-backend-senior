package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.AddressMapper;
import com.menegasso.projetobackendsenior.domain.repository.address.AddressRepository;
import java.util.Optional;

/**
 * Use case for retrieving an Address by ID.
 * Defines the business operation for fetching an Address,
 * converting between the domain model and AddressDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class GetAddressByIdUseCase {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public GetAddressByIdUseCase(AddressRepository addressRepository, AddressMapper addressMapper) {
        this.addressRepository = addressRepository;
        this.addressMapper = addressMapper;
    }

    public Optional<AddressDTO> execute(Long id) {
        return addressRepository.findById(id)
                .map(addressMapper::toDTO);
    }
}
