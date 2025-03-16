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
public class SpecialistVeterinarian extends GeneralVeterinarian {

    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    @Override
    public String examinePet(Pet pet) {
        return "specialized exam for:"+ pet.toString();
    }
}
