package model;

public class SUVRates implements RateStrategy{
    public double calculateRate(long hours){
        return hours * 20;
    }
}
