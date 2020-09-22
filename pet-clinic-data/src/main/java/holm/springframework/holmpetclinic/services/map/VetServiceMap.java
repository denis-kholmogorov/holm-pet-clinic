package holm.springframework.holmpetclinic.services.map;

import holm.springframework.holmpetclinic.model.Vet;
import holm.springframework.holmpetclinic.services.CrudService;

import java.util.Set;

/**
 * VetServiceMap
 *
 * @author Denis_Kholmogorov
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
