package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.domain.repository.address.CityRepository;

/**
 * Use case for deleting a City.
 * Defines the business operation for removing a City by ID,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class DeleteCityUseCase {

    private final CityRepository cityRepository;

    public DeleteCityUseCase(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void execute(Long id) {
        cityRepository.deleteById(id);
    }
}
