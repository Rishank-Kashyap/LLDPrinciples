package org.example.insurance.ocp;

public class InsuranceQuote {

    private final double premium;

    public InsuranceQuote(double premium) {
        this.premium = premium;
    }

    public double getPremium() {
        return premium;
    }
}
