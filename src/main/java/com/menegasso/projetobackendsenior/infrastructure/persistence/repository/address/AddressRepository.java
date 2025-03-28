package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.address;

import com.menegasso.projetobackendsenior.infrastructure.persistence.entity.address.AddressEntity;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Address.
 * Defines the contract for persistence operations on Address entities,
 * remaining free of any framework-specific details.
 */
public interface AddressRepository {
    AddressEntity save(AddressEntity address);
    Optional<AddressEntity> findById(Long id);
    List<AddressEntity> findAll();
    void deleteById(Long id);
}
