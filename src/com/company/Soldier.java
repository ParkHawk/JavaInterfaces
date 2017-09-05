package com.company;

public  abstract class Soldier {
    protected String name;
    protected String rank;
    protected String serial;

    protected void sleep(){
        System.out.println("ZZZZZ");
    }

    protected void eat(){
        System.out.println("munch munch");
    }

    protected void march(){
        System.out.println("LEFT! LEFT! LEFT, RIGHT, LEFT!");
    }

    protected abstract void shout();
}
