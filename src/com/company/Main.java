package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setWeidht(2);
        parrot.setAge(2);
        parrot.setGender('m');
        System.out.println(parrot.getWeidht() + " " + parrot.getAge() + " " + parrot.getGender());

        System.out.println("     ");
        Cat cat = new Cat();
        cat.setName("Honor");
        cat.setColor("black");
        cat.setParoda("qok");
        System.out.println(cat.getName() + " " + cat.getColor() + " " + cat.getParoda());

        System.out.println("   ");
        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setAge(5);
        System.out.println(dog.getName() + " " + dog.getAge());

        System.out.println("   ");
        Fish fish = new Fish();
        fish.setWeidht(4);
        fish.setKindOf("fast");
        System.out.println(fish.getKindOf() + " " + fish.getWeidht());

    }
}
