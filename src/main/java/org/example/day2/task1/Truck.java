package org.example.day2.task1;

public class Truck extends Car {

    private boolean started = false;
    private int maxLoadCapacity = 5;
    private int numberOfDoors = 2;
    private int trunkCapacity = 2400;
    private String fuelType = "Diesel";

    public Truck() {
    }

    public Truck(int maxLoadCapacity, int numberOfDoors, int trunkCapacity, String fuelType) {
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    @Override
    int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public void start() {
        if (!started) {
            System.out.println("The truck started");
            started = true;
        }
        else
            System.out.println("The truck already started");

    }

    @Override
    public void stop() {
        if (started) {
            System.out.println("The truck stopped");
            started = false;
        }
        else
            System.out.println("The truck already stopped");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
}
