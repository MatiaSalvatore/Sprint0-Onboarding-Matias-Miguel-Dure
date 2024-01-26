package day_3;

import java.util.HashSet;
import java.util.Set;

public class Person {
    String firstName;
    String lastName;
    Double height;
    int age;
    boolean married;
    private Set<Pet> pets= new HashSet<>();


    public void addPet(Pet pet){
        pet.setOwner(this);
        this.pets.add(pet);
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }



    public void presentation(){
        System.out.println("Presentación de "+ firstName);
        System.out.println("Hola! mi nombre es "+ firstName +" "+lastName+".");
        System.out.println("Tengo "+ age +" años y "+height+" metros de altura.");
        if (married){
            System.out.println("Estoy casado/a.");
        }
        else{
            System.out.println("No estoy casado/a.");
        }

        if (!pets.isEmpty()){
            System.out.println("Mis mascotas se llaman:");
            for (Pet pet: pets){
                System.out.println("-"+pet.getName()+" es un "+pet.getPetType()+" y tiene "+pet.getAge()+" años.");
            }
        }
        else{
            System.out.println("No tengo mascotas.");
        }

    }

    public Person(String firstName, String lastName, Double height, int age, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.married = married;
    }
}
