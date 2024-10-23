package com.campusdual.subclasses;

public class Magazine extends Item{

    private int number;
    private String director;

    public Magazine(String title,  int number, String publicationDate, String director) {
        super(title, publicationDate);
        this.number = number;
        this.director = director;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}