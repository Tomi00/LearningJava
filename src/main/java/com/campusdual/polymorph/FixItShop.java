package com.campusdual.polymorph;

public class FixItShop {
    public static void main(String[] args) {
        Device s1 = new Smartphone("Apple", "Iphone 13 ");
        Device t1 = new Tablet("Xiaomi", "Pad 6 ");
        Device l1 = new Laptop("Apple", "Macbook Air ");

        s1.turnOn();
        t1.turnOn();
        l1.turnOn();

        s1.turnOff();
        t1.turnOff();
        l1.turnOff();

        IChargeable  s2 = new Smartphone("Apple", "Iphone 15 ");
        IChargeable  t2 = new Tablet("Samsung", "Galaxy Tab 3 ");
        IChargeable  l2 = new Laptop("Apple", "Macbook Pro ");

        s2.charge();
        t2.charge();
        l2.charge();
        s2.use();
        t2.use();
        l2.use();

        Device s3 = new Smartphone("Xiaomi", "11 Lite ");
        IChargeable t3 = new Tablet("Ipad", "Mini 2 ");
        Device l3 = new Laptop("Lenovo", "20RR ");

        ((Smartphone)s3).makeACall();
        ((Device)t3).turnOn();
        ((IChargeable)l3).use();
    }
}
