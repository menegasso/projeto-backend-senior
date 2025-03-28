package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.address;

import com.menegasso.projetobackendsenior.infrastructure.persistence.entity.address.City;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for City.
 * Defines the contract for persistence operations on City entities,
 * remaining free of any framework-specific details.
 */
public interface CityRepository {
    City save(City city);
    Optional<City> findById(Long id);
    List<City> findAll();
    void deleteById(Long id);
}
