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
public class Dog extends Pet {

    private String breed;

    public Dog(String breed, String name, int age, String species) {
        super(name, age, species);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Dogs bark";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }
    @Override
    public String toString() {
        return super.toString()+"breed=" + breed;
    }

}
