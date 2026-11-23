class Animal {
    void makeSound() { System.out.println("Some generic animal sound"); }
}
class Dog extends Animal {
    @Override void makeSound() { System.out.println("Bark!"); }
}
class Cat extends Animal {
    @Override void makeSound() { System.out.println("Meow!"); }
}
class Cow extends Animal {
    @Override void makeSound() { System.out.println("Moo!"); }
}

public class Overriding {
    public static void main(String[] args) {
        Animal[] farm = { new Dog(), new Cat(), new Cow() };
        for (Animal a : farm) a.makeSound();   // decided at runtime
    }
}
