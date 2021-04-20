package com.company;

public interface Builder {
    Builder setHamburger(Hamburger hamburger);
    Builder setSalad(Salad salad);
    Builder setWater(Water water);
    FastFood build();
}
