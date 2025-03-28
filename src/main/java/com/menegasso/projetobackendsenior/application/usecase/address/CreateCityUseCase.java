package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.application.dto.address.CityDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.CityMapper;
import com.menegasso.projetobackendsenior.domain.model.address.City;
import com.menegasso.projetobackendsenior.domain.repository.address.CityRepository;

/**
 * Use case for creating a City.
 * Defines the business operation for persisting a new City,
 * converting between the domain model and CityDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreateCityUseCase {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public CreateCityUseCase(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    public CityDTO execute(CityDTO cityDTO) {
        City city = cityMapper.toDomain(cityDTO);
        City savedCity = cityRepository.save(city);
        return cityMapper.toDTO(savedCity);
    }
}
