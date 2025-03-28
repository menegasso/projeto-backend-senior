package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.application.dto.address.CityDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.CityMapper;
import com.menegasso.projetobackendsenior.domain.model.address.City;
import com.menegasso.projetobackendsenior.domain.repository.address.CityRepository;

/**
 * Use case for updating a City.
 * Defines the business operation for updating an existing City,
 * converting between the domain model and CityDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class UpdateCityUseCase {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public UpdateCityUseCase(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    public CityDTO execute(CityDTO cityDTO) {
        City city = cityMapper.toDomain(cityDTO);
        City updatedCity = cityRepository.save(city);
        return cityMapper.toDTO(updatedCity);
    }
}
