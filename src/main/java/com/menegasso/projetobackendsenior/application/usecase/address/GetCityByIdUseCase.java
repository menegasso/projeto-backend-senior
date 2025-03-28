package com.menegasso.projetobackendsenior.application.usecase.address;

import com.menegasso.projetobackendsenior.application.dto.address.CityDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.CityMapper;
import com.menegasso.projetobackendsenior.domain.repository.address.CityRepository;
import java.util.Optional;

/**
 * Use case for retrieving a City by ID.
 * Defines the business operation for fetching a City,
 * converting between the domain model and CityDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class GetCityByIdUseCase {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public GetCityByIdUseCase(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    public Optional<CityDTO> execute(Long id) {
        return cityRepository.findById(id)
                .map(cityMapper::toDTO);
    }
}
