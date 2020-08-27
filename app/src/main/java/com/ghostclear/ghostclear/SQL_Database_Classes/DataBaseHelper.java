package com.ghostclear.ghostclear.SQL_Database_Classes;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {



    public DataBaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // called the first time that a databased is accessed. This code should create a new database.
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create login table
        sqLiteDatabase.execSQL("CREATE TABLE login (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, isFirstLaunch BOOL)");
        // create goal table
        sqLiteDatabase.execSQL("CREATE table goal (id INTEGER PRIMARY KEY AUTOINCREMENT, ghosts INTEGER, minutes INTEGER, seconds INTEGER, sets INTEGER)");
        // create BLEkey table
        sqLiteDatabase.execSQL("CREATE TABLE BLEkey (id INTEGER PRIMARY KEY AUTOINCREMENT, bluetoothKey TEXT, name TEXT)");
        // create prepTime table
        sqLiteDatabase.execSQL("CREATE TABLE prepTime (id INTEGER PRIMARY KEY AUTOINCREMENT, minutes INTEGER, seconds INTEGER)");
        // create timed workouts table
        sqLiteDatabase.execSQL("CREATE TABLE timedWorkouts (id INTEGER PRIMARY KEY AUTOINCREMENT, avgGhosts INTEGER, avgTimeOn TEXT, date TEXT, ghostedCorners TEXT, sets INTEGER, totalGhosts INTEGER, totalTimeOnInSeconds INTEGER)");
        // create number workouts table
        sqLiteDatabase.execSQL("CREATE TABLE numberWorkouts (id INTEGER PRIMARY KEY AUTOINCREMENT, avgGhosts INTEGER, avgTimeOn TEXT, date TEXT, ghostedCorners TEXT, sets INTEGER, totalGhosts INTEGER, totalTimeOnInSeconds INTEGER)");
        // create beep test table
        sqLiteDatabase.execSQL("CREATE TABLE beepTests (id INTEGER PRIMARY KEY AUTOINCREMENT, score TEXT, greatestLevel INTEGER, avgTimeOn TEXT, totalTimeOnInSeconds INTEGER, totalGhosts INTEGER, date TEXT)");
        // create pro workout table
        sqLiteDatabase.execSQL("CREATE TABLE proWorkout (id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, totalGames INTEGER, difficulty TEXT, playerNames TEXT, matchNames TEXT, totalGhosts INTEGER, totalTimeOnInSeconds INTEGER)");
    }

    // called if the version number of the database is changed.
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean addLoginItem(Login loginObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("isFirstLaunch", loginObject.isFirstLaunch);
        cv.put("name", loginObject.name);
        long databaseDidAppendValues = db.insert("login", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addGoalItem(Goal goalObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ghosts", goalObject.numGhosts);
        cv.put("minutes", goalObject.numMinutesOn);
        cv.put("seconds", goalObject.numSecondsOn);
        cv.put("sets", goalObject.sets);
        long databaseDidAppendValues = db.insert("goal", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addTimedWorkoutItem(TimedWorkout timedWorkoutObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("avgGhosts", timedWorkoutObject.avgGhost);
        cv.put("avgTimeOn", timedWorkoutObject.avgTimeOn);
        cv.put("date", timedWorkoutObject.date);
        cv.put("ghostedCorners", timedWorkoutObject.ghostedCorners);
        cv.put("sets", timedWorkoutObject.sets);
        cv.put("totalGhosts", timedWorkoutObject.totalGhosts);
        cv.put("totalTimeOnInSeconds", timedWorkoutObject.totalTimeOnInSeconds);
        long databaseDidAppendValues = db.insert("timedWorkouts", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addNumberWorkoutItem(NumberWorkout numberWorkoutObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("avgGhosts", numberWorkoutObject.avgGhost);
        cv.put("avgTimeOn", numberWorkoutObject.avgTimeOn);
        cv.put("date", numberWorkoutObject.date);
        cv.put("ghostedCorners", numberWorkoutObject.ghostedCorners);
        cv.put("sets", numberWorkoutObject.sets);
        cv.put("totalGhosts", numberWorkoutObject.totalGhosts);
        cv.put("totalTimeOnInSeconds", numberWorkoutObject.totalTimeOnInSeconds);
        long databaseDidAppendValues = db.insert("numberWorkouts", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addBeepTestItem(BeepTest beepTestObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("score", beepTestObject.score);
        cv.put("greatestLevel", beepTestObject.greatestLevel);
        cv.put("avgTimeOn", beepTestObject.avgTimeOn);
        cv.put("totalTimeOnInSeconds", beepTestObject.totalTimeOnInSeconds);
        cv.put("totalGhosts", beepTestObject.totalGhosts);
        cv.put("date", beepTestObject.date);
        long databaseDidAppendValues = db.insert("beepTests", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addProWorkoutItem(ProWorkout proWorkoutObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("date", proWorkoutObject.date);
        cv.put("totalGames", proWorkoutObject.totalGames);
        cv.put("difficulty", proWorkoutObject.difficulty);
        cv.put("playerNames", proWorkoutObject.playerNames);
        cv.put("matchNames", proWorkoutObject.matchNames);
        cv.put("totalGhosts", proWorkoutObject.totalGhosts);
        cv.put("totalTimeOnInSeconds", proWorkoutObject.totalTimeOnInSeconds);
        long databaseDidAppendValues = db.insert("proWorkout", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addBLEkeyItem(BLEkey bleKeyObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("bluetoothKey", bleKeyObject.bluetoothKey);
        cv.put("name", bleKeyObject.name);
        long databaseDidAppendValues = db.insert("BLEkey", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean addPrepTimeItem(PrepTime prepTimeObject){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("minutes", prepTimeObject.minutes);
        cv.put("seconds", prepTimeObject.seconds);
        long databaseDidAppendValues = db.insert("prepTime", null, cv);
        System.out.println(databaseDidAppendValues >= 0);
        return databaseDidAppendValues >= 0;
    }
    public boolean isFirstLogin(){
        SQLiteDatabase db = this.getReadableDatabase();
        long count = DatabaseUtils.queryNumEntries(db, "login");
        return count == 0;
    }
}
