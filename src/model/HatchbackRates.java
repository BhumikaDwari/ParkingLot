package model;

public class HatchbackRates implements RateStrategy{
    @Override
    public double calculateRate(long hours) {
        return hours * 10;
    }
}
