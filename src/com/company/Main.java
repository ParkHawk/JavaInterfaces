package com.company;

public class Main {

    public static void main(String[] args) {
	    Marine myMarine = new Marine();
	    Army myArmy = new Army();


        myMarine.eat();
        myMarine.sleep();
        myMarine.march();
        myMarine.shout();
        myMarine.urbanClose();
        myMarine.urbanMid();
        myMarine.urbanFar();
        myMarine.gunit();

        System.out.println("-------------");

        myArmy.eat();
        myArmy.sleep();
        myArmy.march();
        myArmy.shout();
        myArmy.openClose();
        myArmy.openMid();
        myArmy.openFar();
        myArmy.bomb();
    }
}
