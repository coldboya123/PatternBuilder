package com.company;

public class FastFood {
    private Hamburger hamburger;
    private Salad salad;
    private Water water;


    public FastFood(Hamburger hamburger, Salad salad, Water water) {
        this.hamburger = hamburger;
        this.salad = salad;
        this.water = water;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Salad getSalad() {
        return salad;
    }

    public Water getWater() {
        return water;
    }

    public static class BuilderFastFood implements Builder{

        private Hamburger hamburger;
        private Salad salad;
        private Water water;

        @Override
        public Builder setHamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        @Override
        public Builder setSalad(Salad salad) {
            this.salad = salad;
            return this;
        }

        @Override
        public Builder setWater(Water water) {
            this.water = water;
            return this;
        }

        @Override
        public FastFood build() {
            return new FastFood(hamburger, salad, water);
        }
    }

}
