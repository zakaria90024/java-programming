package com.gmail.shihab4t.chapter06.c09.staticVariableConstantMethod;

public class CricketPlayer {
    private static int totalScore;
    private String name;
    private int score;

    public CricketPlayer(String name) {
        this.name = name;
    }

    public static int getTotalScore() {
        return totalScore;
    }

    public void addScore(int score) {
        this.score += score;
        totalScore += score;
    }

    public int getScore() {
        return score;
    }
}
