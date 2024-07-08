package model;

public class ParkingSlot {
    private CarType carType;
    private boolean occupied;

    public ParkingSlot(CarType carType){
        this.carType = carType;
        this.occupied = false;
    }

    public CarType getCarType() {
        return carType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy(){
        occupied = true;
    }

    public void vacate(){
        occupied = false;
    }
}
