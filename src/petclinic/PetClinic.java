/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.util.ArrayList;

/**
 *
 * @author user1
 */
public class PetClinic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Dog("a","baby",4,"z"));
        pets.add(new Cat("a", "catush", 9, "n"));
        
        ArrayList<Veterinarian> veterinarians =new ArrayList<>();
        veterinarians.add(new GeneralVeterinarian("Dr. Smith"));
        veterinarians.add(new SpecialistVeterinarian("Dr. Brown", "Dermatology"));

        for (Pet pet : pets) {
            System.out.println(pet);
            System.out.println("eats: " + pet.eat());
            System.out.println("makes sount:" + pet.makeSound());
            for(Veterinarian veterinarian:veterinarians){
                System.out.println(veterinarian.examinePet(pet));
            }
            
            System.out.println("-------------------------");
        }

    }

}
