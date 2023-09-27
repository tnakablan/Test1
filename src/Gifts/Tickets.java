package Gifts;

import Gifts.Gift;

public class Tickets implements Gift {
    @Override
    public void openGift() {
        System.out.println("Congratulations! you got a new gift! Enjoy!");
    }
}
