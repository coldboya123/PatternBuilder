package com.company;

public enum Hamburger {
    BUUTER(0), BUFFALO(1), CALIFONIA(2);
    private int value;

    Hamburger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
