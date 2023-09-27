package Bonus;

import Bonus.Animal;

public class Cat extends Animal implements pet {
    private String name;

    public Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public void getName(String name) {
        System.out.println("the name of the cat"+name);
    }

    @Override
    public void setName(String name) {
        this.name = "alex";
    }

    @Override
    public void play() {
        System.out.println("this cat "+name+"is playing ");
    }

    @Override
    public void eat() {
        System.out.println("this cat "+name+"is eating ");
    }

    @Override
    public void walk() {

    }
}
