package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private Pet[] list;
    private String ownerName;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.ownerName=name;
        list=pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {


    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
       if(pet.getOwner().ownerName==list[0].getName())
       return true;
                       else
       return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

       // for (int i = 0; i <= list.length ; i++) {
            if(list[0].getAge()> list[1].getAge())
                return list[1].getAge();
             else
                 return list[0].getAge();

    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        if(list[0].getAge()< list[1].getAge())
            return list[1].getAge();
        else
            return list[0].getAge();

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
          int check=list.length;
            return Float.valueOf((list[0].getAge()+ list[1].getAge())/2);

    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return list.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return list;
    }
}
