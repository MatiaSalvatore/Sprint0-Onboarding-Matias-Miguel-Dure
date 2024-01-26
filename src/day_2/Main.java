package day_2;

public class Main {
    public static void main(String[] args) {
        String[] pets_1 = {"Loly","Felipe"};
        String[] pets_2 = {};
        Person person_1 = new Person("Matias","Dure",1.69,26,true,pets_1);
        Person person_2 = new Person("Max","Power",1.8,52,false,pets_2);
        person_1.presentation();
        person_2.presentation();
    }

}
