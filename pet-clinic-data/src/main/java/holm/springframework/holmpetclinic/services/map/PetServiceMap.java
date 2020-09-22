package holm.springframework.holmpetclinic.services.map;

import holm.springframework.holmpetclinic.model.Pet;
import holm.springframework.holmpetclinic.services.CrudService;

import java.util.Set;

/**
 * PetServiceMap
 *
 * @author Denis_Kholmogorov
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
