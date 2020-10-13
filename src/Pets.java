package src;

public class Pets {
// PROPERTIES

    private String name;
    private int age;
    private String location;
    private String type;

// CONSTRUCTORS 

    public Pets(String petName, int petAge, String petLocation, String petType){
        System.out.println("Constructor 1 invoked");
        name = petName;
        age = petAge;
        location = petLocation;
        type = petType;
    }

    public Pets(){
        System.out.println("Constructor #2 invoked");
    }

// GET METHODS

    public void getPetAge() {
        System.out.println("\nPet age is: " + age);
    }

    public void getPetName() {
        System.out.println("\nPet name is: " + name);
    }

    public void getPetLocation() {
        System.out.println("\nPet is located at: " + location);
    }

// SET METHODS

    public void changeName(String newPetName) {
        System.out.println("This pet is now named " + newPetName + ".");
        }

    public void changeAge(int newPetAge) {
        System.out.println("This pet is now " + newPetAge + " years old.");
        }

    public void changeType(String newPetType) {
        System.out.println("This pet is now a " + newPetType + ".");
        }
}
