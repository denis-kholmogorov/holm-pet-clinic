package holm.springframework.holmpetclinic.services;


import holm.springframework.holmpetclinic.model.Vet;

import java.util.Set;

/**
 * VetService
 *
 * @author Denis_Kholmogorov
 */
public interface VetService {

    Vet getById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
