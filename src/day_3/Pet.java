package day_3;

public class Pet {
    String name;
    int age;

    private PetType petType;
    private Person owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Pet(String name, int age, PetType petType) {
        this.name = name;
        this.age = age;
        this.petType = petType;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", petType=" + petType +
                ", owner=" + owner +
                '}';
    }
}
