package src;

public class Cats {
// PROPERTIES
    private String name;
    private int age;
    private String pattern;

// CONSTRUCTORS

    public Cats(String catName, int catAge, String catPattern){
        System.out.println("Constructor 1 invoked");
        name = catName;
        age = catAge;
        pattern = catPattern;
    }

    public Cats(String name, int age){
        System.out.println("Constructor 2 invoked");
    }

    public Cats() {
        System.out.println("Constructor 3 invoked");
    }

// GET METHODS

public void getCatAge() {
    System.out.println("\nCat age is: " + age);
}

public void getCatName() {
    System.out.println("\nCat name is: " + name);
}

public void getCatPattern() {
    System.out.println("\nCat is " + pattern);
}

// SET METHODS

public void changeName(String newCatName) {
    System.out.println("This cat is now named " + newCatName + ".");
    }

public void changeAge(int newCatAge) {
    System.out.println("This cat is now " + newCatAge + " years old.");
    }

public void changePattern(String newCatPattern) {
    System.out.println("This cat is now " + newCatPattern + ".");
    }

// METHODS THAT RETURN BOOLEAN AND STRING (SEPARATE

public void catIsBaby(int age) {
    if(this.age < 3) {
        System.out.println("This cat is 100% baby!");
    }
}

public void isCatBaby(int age) {
    System.out.println(this.age < 3);
}

}
