package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class CricketPlayerDemo {
    public static void main(String[] args) {
        CricketPlayer sayeem = new CricketPlayer("Sayeem");
        sayeem.addScore(1);
        sayeem.addScore(4);
        sayeem.addScore(6);
        sayeem.addScore(4);

        CricketPlayer rifat = new CricketPlayer("Rifat");
        rifat.addScore(0);
        rifat.addScore(1);
        rifat.addScore(2);
        rifat.addScore(4);


        CricketPlayer sakib = new CricketPlayer("Sakib");
        sakib.addScore(6);
        sakib.addScore(1);
        sakib.addScore(4);
        sakib.addScore(1);
        sakib.addScore(1);
        sakib.addScore(2);

        System.out.println("sayeem = " + sayeem.getScore());
        System.out.println("rifat = " + rifat.getScore());
        System.out.println("sakib = " + sakib.getScore());

        System.out.println("Total score = " + CricketPlayer.getTotalScore());
    }
}
