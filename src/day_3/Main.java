package day_3;

public class Main {
    public static void main(String[] args) {
        Pet pet_1 = new Pet("Loly",10,PetType.perro);
        Pet pet_2 = new Pet("Felipe",7,PetType.gato);

        Person person_1 = new Person("Matias","Dure",1.69,26,true);
        person_1.addPet(pet_2);
        person_1.addPet(pet_1);

        Person person_2 = new Person("Max","Power",1.8,52,false);
        person_1.presentation();
        person_2.presentation();
    }

}
