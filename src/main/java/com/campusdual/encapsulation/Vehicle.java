package com.campusdual.encapsulation;

public class Vehicle {
    // Definamos atributos, como: marca, modelo, matrícula, disponibilidad para alquilar y velocidad máxima legal
    private String brand;
    private String model;
    private String licensePlate;
    private boolean available;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.available = true;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentACar() {
        if (this.available) {
            this.available = false;
            System.out.println("The vehicle with license plate " + this.licensePlate + " has been rented.");
        }
        else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is not available.");
        }
    }

    public void returnACar(){
        if (!this.available) {
            this.available = true;
            System.out.println("The vehicle with license plate " + this.licensePlate + " has been returned.");
        }
        else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is already available.");
        }
    }

    public String getDetails(){
        return this.brand + " " + this.model +  "\n\tlicense plate: " + this.licensePlate + " \n\tAvailable: " + (this.available ? "Yes" : "No" );
    }



    public static void main(String[] args) {
        Vehicle v = new Vehicle("Citroen", "Xsara", "0000");
        System.out.println(v.getDetails());
        v.rentACar();
        System.out.println(v.getDetails());
        v.returnACar();
        System.out.println(v.getDetails());
    }


}
