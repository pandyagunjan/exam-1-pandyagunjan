package com.zipcodewilmington.assessment1.part3;
import java.util.Arrays;
/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] ownersPets = new Pet[0];
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        setOwnerOnPet(pets);
    }
    private void setOwnerOnPet(Pet[] pets) {
        if (pets != null) {
            for (Pet pet : pets) {
                addPet(pet);
            }
        }
    }
    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        Pet[] newPets = Arrays.copyOf(ownersPets, ownersPets.length + 1);
        newPets[newPets.length - 1] = pet;
        ownersPets = newPets;
    }
    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < ownersPets.length; i++) {
            if (ownersPets[i] != null && ownersPets[i] == pet) {
                ownersPets[i] = null;
            }
        }
    }
    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.equals(pet.getOwner());
    }
    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngestPet = null;
        for (Pet pet : ownersPets) {
            if (youngestPet == null) {
                youngestPet = pet;
            } else if (pet.getAge() < youngestPet.getAge()) {
                youngestPet = pet;
            }
        }
        return youngestPet.getAge();
    }
    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet oldestPet = null;
        for (Pet pet : ownersPets) {
            if (oldestPet == null) {
                oldestPet = pet;
            } else if (pet.getAge() > oldestPet.getAge()) {
                oldestPet = pet;
            }
        }
        return oldestPet.getAge();
    }
    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float averageAgeOfPets = 0.00f;
        for (Pet pet : ownersPets) {
            averageAgeOfPets += pet.getAge();
        }
        return averageAgeOfPets / ownersPets.length;
    }
    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return ownersPets.length;
    }
    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }
    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.ownersPets;
    }
}






