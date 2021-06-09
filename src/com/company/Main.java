package com.company;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        Bill[] payments = new Bill[]{

                new Bill(100, new IncomeTaxType(), taxService),
                new Bill(100, new VATaxType(), taxService),
                new Bill(100000, new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
