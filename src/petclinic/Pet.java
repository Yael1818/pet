/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

/**
 *
 * @author user1
 */
public abstract class Pet {

    private String name;
    private int age;
    protected String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String makeSound();

    public abstract String eat();

    @Override
    public String toString() {
        return  "name=" + name + ", age=" + age + ", species=" + species+" ";
    }
    

}
