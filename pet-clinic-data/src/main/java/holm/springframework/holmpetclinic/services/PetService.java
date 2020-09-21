package holm.springframework.holmpetclinic.services;

import holm.springframework.holmpetclinic.model.Pet;

import java.util.Set;

/**
 * PetService
 *
 * @author Denis_Kholmogorov
 */
public interface PetService {

    Pet getById(Long id);

    Pet save(Pet vet);

    Set<Pet> findAll();
}
