package com.company;

public class ProgressiveTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        double coefficient = amount >= 100000 ? 0.15 : 0.1;
        return amount * coefficient;
    }
}
