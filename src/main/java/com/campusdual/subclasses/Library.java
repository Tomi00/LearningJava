package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("The Martian Chronicles", "Kay Bradbury", "1950-05-04", "97855452436" );
        Magazine magazine = new Magazine ("Historia National Geogrpahic", 245, "2024-05", "Josep Maria Casals");
        DVD dvd = new DVD("Inception", "Christopher Nolan", "2010-07-16", 148);


        System.out.println(item.getDetails());
        System.out.println(book.getDetails());
        book.checkedOut();
        book.returnItem();

        System.out.println(magazine.getDetails());
        magazine.checkedOut();
        magazine.returnItem();

        System.out.println(dvd.getDetails());
        dvd.checkedOut();
        dvd.play();
        dvd.returnItem();
    }
}
