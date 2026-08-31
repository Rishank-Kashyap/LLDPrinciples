package org.example.insurance.ocp;

public abstract class Vehicle {

    protected final double value;

    protected Vehicle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract double calculatePremium();
}
