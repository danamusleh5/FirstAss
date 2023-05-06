package com.example.firstass;

import androidx.annotation.NonNull;

public class Subject {

    private String name;
    private int classNum;

    private int chapter;

    private String title;


    private Subject( String name, int classNum, int chapter, String title ){
        this.name = name;
        this.classNum = classNum;
        this.chapter = chapter;
        this.title = title;

    }


    public static final Subject[] subjects= {
        new Subject("Math",6,9 , "MOD"),
            new Subject("Biology",6,8,"Body Cycle"),
            new Subject("Chemistry",3,9,"Elements"),
            new Subject("Math",4,10,"Squares")};


    public int getChapter() {
        return chapter;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}


