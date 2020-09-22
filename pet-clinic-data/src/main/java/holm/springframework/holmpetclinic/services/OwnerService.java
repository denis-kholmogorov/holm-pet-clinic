package holm.springframework.holmpetclinic.services;

import holm.springframework.holmpetclinic.model.Owner;

/**
 * OwnerService
 *
 * @author Denis_Kholmogorov
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner getByLastName(String name);
}
