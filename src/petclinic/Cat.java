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
public class Cat extends Pet {

    private String color;

    public Cat(String color, String name, int age, String species) {
        super(name, age, species);
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Cats meow";
    }

    @Override
    public String eat() {
        return "Cats eat cat food";
    }

    @Override
    public String toString() {
        return super.toString()+"color=" + color;
    }

    
}
