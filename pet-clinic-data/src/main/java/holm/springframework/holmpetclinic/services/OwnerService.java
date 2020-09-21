package holm.springframework.holmpetclinic.services;

import holm.springframework.holmpetclinic.model.Owner;

import java.util.Set;

/**
 * OwnerService
 *
 * @author Denis_Kholmogorov
 */
public interface OwnerService {

    Owner getById(Long id);

    Owner getByLastName(String name);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
