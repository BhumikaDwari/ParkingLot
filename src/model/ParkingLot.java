package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingSlot> slots;
    private Map<Integer, Car> parkedCar;
    private int suvCount;
    private int hatchbackCount;

    public ParkingLot(int suvSlots, int hatchbackSlots){
        slots = new ArrayList<>();
        parkedCar = new HashMap<>();
        suvCount = 0;
        hatchbackCount = 0;

        for(int i = 0; i < suvSlots; i++){
            slots.add(new ParkingSlot(CarType.SUV));
        }

        for(int i = 0; i < hatchbackSlots; i++){
            slots.add(new ParkingSlot(CarType.HATCHBACK));
        }
    }

    public boolean enterCar(CarType carType){
        int slotNumber = findAvailableSlot(carType);
        if(slotNumber == -1){
            return false;
        }
        LocalDateTime entryTime = LocalDateTime.now();
        RateStrategy rateStrategy = carType == CarType.SUV ? new SUVRates() : new HatchbackRates();
        Car car = new Car(rateStrategy, entryTime, slotNumber);
        if(carType == carType.SUV){
            suvCount++;
        }
        else{
            hatchbackCount++;
        }
        return true;
    }

    public double exitCar(int slotNumber){
        if(!parkedCar.containsKey(slotNumber)){
            return -1;
        }
    }
}
