package com.mtjk.patterns.creative.prototype;

public class Car implements Vehicle {
    private String type = "Car";

    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getType() {
        return type;
    }
}
