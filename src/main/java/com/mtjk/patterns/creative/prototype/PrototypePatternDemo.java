package com.mtjk.patterns.creative.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle clonedCar = car.clone();
        System.out.println("Original: " + car.getType());
        System.out.println("Cloned: " + clonedCar.getType());

        Vehicle motorcycle = new Motorcycle();
        Vehicle clonedMotorcycle = motorcycle.clone();
        System.out.println("Original: " + motorcycle.getType());
        System.out.println("Cloned: " + clonedMotorcycle.getType());
    }
}
