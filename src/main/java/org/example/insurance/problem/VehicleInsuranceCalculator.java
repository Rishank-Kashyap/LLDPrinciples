package org.example.insurance.problem;

class InsuranceQuote{
    double premium;

    InsuranceQuote(double premium){
        this.premium = premium;
    }

    double getPremium(){
        return premium;
    }
}

class Vehicle{
    double value;

    Vehicle(double value){
        this.value = value;
    }

    double getValue(){
        return value;
    }
}

class Car extends Vehicle{
    Car(double value){
        super(value);
    }
}

class Truck extends Vehicle{
    Truck(double value){
        super(value);
    }
}

public class VehicleInsuranceCalculator {
    public InsuranceQuote evaluateInsurance(Vehicle vehicle){
        if(vehicle instanceof Car){
            return new InsuranceQuote(vehicle.getValue() * 0.03);
        }else if(vehicle instanceof Truck){
            return new InsuranceQuote(vehicle.getValue() * 0.08);
        }
        throw new IllegalArgumentException("Invalid Vehicle");
    }
}
