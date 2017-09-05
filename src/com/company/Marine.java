package com.company;

public class Marine extends Soldier implements Urban {

    protected void shout(){
        System.out.println("Hoorah");
    }

    @Override
    public void urbanClose() {
        System.out.println("Check your corners!");
    }

    @Override
    public void urbanMid() {
        System.out.println("Watch your flanks!");
    }

    @Override
    public void urbanFar() {
        System.out.println("Keep your eyes peeled!");
    }

    @Override
    public void gunit() {
        System.out.println("GO!");
    }
}
