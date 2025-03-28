package com.menegasso.projetobackendsenior.domain.service.address;

import com.menegasso.projetobackendsenior.domain.model.address.City;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for City.
 * Defines business operations on City entities,
 * remaining free of any framework-specific details.
 */
public interface CityService {
    City createCity(City city);
    Optional<City> getCityById(Long id);
    List<City> getAllCities();
    City updateCity(City city);
    void deleteCity(Long id);
}
