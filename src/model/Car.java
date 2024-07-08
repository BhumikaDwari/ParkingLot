package model;

import java.time.LocalDateTime;

public class Car {
    private RateStrategy rateStrategy;
    private LocalDateTime entryTime;
    private int slotNumber;

    public Car(RateStrategy rateStrategy, LocalDateTime entryTime, int slotNumber){
        this.rateStrategy = rateStrategy;
        this.entryTime = entryTime;
        this.slotNumber = slotNumber;
    }

    public LocalDateTime getEntryTime(){
        return entryTime;
    }

    public int getSlotNumber(){
        return slotNumber;
    }

    public RateStrategy getRateStrategy() {
        return rateStrategy;
    }

    public double calculateRate(long hours){
        return rateStrategy.calculateRate(hours);
    }
}
