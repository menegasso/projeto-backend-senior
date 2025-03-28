package com.menegasso.projetobackendsenior.domain.service.address;

import com.menegasso.projetobackendsenior.domain.model.address.Address;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Address.
 * Defines business operations on Address entities,
 * remaining free of any framework-specific details.
 */
public interface AddressService {
    Address createAddress(Address address);
    Optional<Address> getAddressById(Long id);
    List<Address> getAllAddresses();
    Address updateAddress(Address address);
    void deleteAddress(Long id);
}
