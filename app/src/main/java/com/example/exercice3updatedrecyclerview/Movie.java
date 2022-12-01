package com.example.exercice3updatedrecyclerview;

public class Movie {

    private String name, year, genre;

    public Movie(String n, String y, String g){
        this.name= n;
        this.genre= g;
        this.year = y;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }
}
