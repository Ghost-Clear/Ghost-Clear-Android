package com.ghostclear.ghostclear;

public class BeepTest {
    String score, avgTimeOn, date;
    int greatestLevel, totalTimeOnInSeconds, totalGhosts;

    public BeepTest(String score, String avgTimeOn, String date, int greatestLevel, int totalTimeOnInSeconds, int totalGhosts) {
        this.score = score;
        this.avgTimeOn = avgTimeOn;
        this.date = date;
        this.greatestLevel = greatestLevel;
        this.totalTimeOnInSeconds = totalTimeOnInSeconds;
        this.totalGhosts = totalGhosts;
    }
}
