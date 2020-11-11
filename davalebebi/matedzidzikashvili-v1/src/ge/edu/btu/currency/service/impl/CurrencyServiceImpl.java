package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    double exchangeRate;

    @Override
    public double convert(int amount) {
        return amount / this.exchangeRate;
    }

    @Override
    public double convert(double amount) {
        return amount / this.exchangeRate;
    }

    @Override
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }
}
