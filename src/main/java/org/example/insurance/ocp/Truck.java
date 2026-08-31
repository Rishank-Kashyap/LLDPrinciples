package org.example.insurance.ocp;

public class Truck extends Vehicle {

    public Truck(double value) {
        super(value);
    }

    @Override
    public double calculatePremium() {
        return value * 0.08;
    }
}
