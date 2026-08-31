package org.example.insurance.ocp;

public class VehicleInsuranceCalculator {

    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        return new InsuranceQuote(vehicle.calculatePremium());
    }
}
