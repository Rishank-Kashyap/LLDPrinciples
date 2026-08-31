package org.example.insurance.ocp;

public class Demo {
    public static void main(String[] args) {

        VehicleInsuranceCalculator calculator = new VehicleInsuranceCalculator();

        System.out.println(calculator.evaluateInsurance(new Car(800000)).getPremium());
        System.out.println(calculator.evaluateInsurance(new Truck(800000)).getPremium());
    }
}
