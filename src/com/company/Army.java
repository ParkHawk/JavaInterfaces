package com.company;

public class Army extends Soldier implements open, Bomb {

    protected void shout() {
        System.out.println("Hooah");
    }

    @Override
    public void openClose() {
        System.out.println("Stay Frosty!");
    }

    @Override
    public void openMid() {
        System.out.println("Keep quite!");
    }

    @Override
    public void openFar() {
        System.out.println("Stay low!");
    }

    @Override
    public void bomb() {
        System.out.println("Plant the Bomb and go!");
    }
}
