package org.example.insurance.ocp;

public class Car extends Vehicle {

    public Car(double value) {
        super(value);
    }

    @Override
    public double calculatePremium() {
        return value * 0.03;
    }
}
