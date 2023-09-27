package Bonus;

import Bonus.Animal;

public class Spider extends Animal {
    public Spider(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("This spider  is eating");
    }

    @Override
    public void walk() {

    }
}
