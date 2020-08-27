package com.ghostclear.ghostclear.SQL_Database_Classes;

public class ProWorkout {
    String date, difficulty, playerNames, matchNames;
    int totalGames, totalGhosts, totalTimeOnInSeconds;

    public ProWorkout(String date, String difficulty, String playerNames, String matchNames, int totalGames, int totalGhosts, int totalTimeOnInSeconds) {
        this.date = date;
        this.difficulty = difficulty;
        this.playerNames = playerNames;
        this.matchNames = matchNames;
        this.totalGames = totalGames;
        this.totalGhosts = totalGhosts;
        this.totalTimeOnInSeconds = totalTimeOnInSeconds;
    }
}
