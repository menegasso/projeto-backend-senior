package com.menegasso.projetobackendsenior.domain.repository.address;

import com.menegasso.projetobackendsenior.domain.model.address.Address;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Address.
 * Defines the contract for persistence operations on Address entities,
 * remaining free of any framework-specific details.
 */
public interface AddressRepository {
    Address save(Address address);
    Optional<Address> findById(Long id);
    List<Address> findAll();
    void deleteById(Long id);
}
