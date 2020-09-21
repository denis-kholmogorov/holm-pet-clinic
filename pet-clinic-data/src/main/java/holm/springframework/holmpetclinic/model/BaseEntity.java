package holm.springframework.holmpetclinic.model;

import java.io.Serializable;

/**
 * BaseEntity
 *
 * @author Denis_Kholmogorov
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
