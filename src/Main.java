package src;

public class Main {
    public static void main(String[] args) {
        Pets myDog = new Pets("Maya", 12, "Massachusetts", "Havanese");

        Pets myCat = new Pets();

        myDog.getPetAge();
        myDog.getPetName();
        myDog.getPetLocation();

        myDog.changeName("Munchkin");
        myDog.changeAge(15);
        myDog.changeType("Bernese Mountain Dog");

        Cats myKitty = new Cats("Aiko", 1, "striped");

        myKitty.catIsBaby(1);

        myKitty.isCatBaby(1);

        }
    }
