package PolymorphismExample;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Cat("mew mew");
        System.out.println(animal1.sound());
        Animal animal2 = new Dog("baa baa");
        System.out.println(animal2.sound());
    }
}
