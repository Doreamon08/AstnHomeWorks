package org.example.day2.task1;

public class Sedan extends Car {

    private boolean started = false;
    private int luxuryLevel = 0;
    private int numberOfDoors = 5;
    private int trunkCapacity = 400;
    private String fuelType = "Gasoline";

    public Sedan() {
    }

    public Sedan(int luxuryLevel, int numberOfDoors, int trunkCapacity, String fuelType) {
        this.luxuryLevel = luxuryLevel;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public int getLuxuryLevel() {
        return luxuryLevel;
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
            System.out.println("The sedan started");
            started = true;
        }
        else
            System.out.println("The sedan already started");

    }

    @Override
    public void stop() {
        if (started) {
            System.out.println("The sedan stopped");
            started = false;
        }
        else
            System.out.println("The sedan already stopped");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
