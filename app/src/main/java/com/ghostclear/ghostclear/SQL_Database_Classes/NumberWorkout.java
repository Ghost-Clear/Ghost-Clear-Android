package com.ghostclear.ghostclear.SQL_Database_Classes;

public class NumberWorkout {
    int avgGhost, sets, totalGhosts, totalTimeOnInSeconds;
    String avgTimeOn, date, ghostedCorners;

    public NumberWorkout(int avgGhost, int sets, int totalGhosts, int totalTimeOnInSeconds, String avgTimeOn, String date, String ghostedCorners) {
        this.avgGhost = avgGhost;
        this.sets = sets;
        this.totalGhosts = totalGhosts;
        this.totalTimeOnInSeconds = totalTimeOnInSeconds;
        this.avgTimeOn = avgTimeOn;
        this.date = date;
        this.ghostedCorners = ghostedCorners;
    }
}
