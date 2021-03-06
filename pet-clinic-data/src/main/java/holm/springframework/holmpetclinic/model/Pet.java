package holm.springframework.holmpetclinic.model;

import java.time.LocalDate;

/**
 * Pet
 *
 * @author Denis_Kholmogorov
 */
public class Pet extends BaseEntity{

    private PetType petType;

    private Owner owner;

    private LocalDate birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
