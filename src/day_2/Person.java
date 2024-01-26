package day_2;

public class Person {
    String firstName;
    String lastName;
    Double height;
    int age;
    boolean married;
    String[] petNames;

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

    public String[] getPetNames() {
        return petNames;
    }

    public void setPetNames(String[] petNames) {
        this.petNames = petNames;
    }

    public void presentation(){
        System.out.println("Presentación de "+ firstName);
        System.out.println("Hola! mi nombre es "+ firstName +" "+lastName+".");
        System.out.println("Tengo "+ age +" años y "+height+" metros de altura.");
        if (married == true){
            System.out.println("Estoy casado/a.");
        }
        else{
            System.out.println("No estoy casado/a.");
        }

        if (petNames.length > 0){
            System.out.println("Mis mascotas se llaman:");
            for (int i=0; i < petNames.length; i++){
                System.out.println("-"+petNames[i]);
            }
        }
        else{
            System.out.println("No tengo mascotas.");
        }

    }

    public Person(String firstName, String lastName, Double height, int age, boolean married, String[] petNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
        this.married = married;
        this.petNames = petNames;
    }
}
