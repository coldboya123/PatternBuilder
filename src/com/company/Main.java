package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FastFood fastFood = new FastFood.BuilderFastFood()
                .setHamburger(Hamburger.BUFFALO)
                .setSalad(Salad.CHEESE)
                .setWater(Water.BEER)
                .build();
        System.out.println(fastFood.getHamburger().toString());
    }
}
