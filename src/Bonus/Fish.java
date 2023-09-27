package Bonus;

import Bonus.Animal;

public class Fish extends Animal implements pet {
    private String name;

    public Fish(int legs, String name) {
        super(legs);
        this.name = name;
    }
    @Override
    public void setName(String name) {
        this.name = "memo";
    }

    @Override
    public void play() {
        System.out.println("this fish "+name+"is playing ");
    }

    @Override
    public void eat() {
        System.out.println("this fish "+name+"is eating ");
    }

    @Override
    public void walk() {
        System.out.println("this fish"+name+"is swimming");
    }  @Override
    public void getName(String name) {
        System.out.println("the name of the fish"+name);
    }
}
