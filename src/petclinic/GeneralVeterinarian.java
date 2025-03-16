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
public class GeneralVeterinarian implements Veterinarian {

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String examinePet(Pet pet) {
        return "General exam for:"+ pet.toString();
    }

}
