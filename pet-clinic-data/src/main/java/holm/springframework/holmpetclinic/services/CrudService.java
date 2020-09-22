package holm.springframework.holmpetclinic.services;

import java.util.Set;

/**
 * CrudServise
 *
 * @author Denis_Kholmogorov
 */
public interface CrudService<T, ID> {

    T getById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
