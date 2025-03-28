package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.domain.repository.address.AddressRepository;

/**
 * Use case for deleting an Address.
 * Defines the business operation for removing an Address by ID,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class DeleteAddressUseCase {

    private final AddressRepository addressRepository;

    public DeleteAddressUseCase(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void execute(Long id) {
        addressRepository.deleteById(id);
    }
}
