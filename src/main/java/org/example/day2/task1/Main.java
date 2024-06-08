package org.example.day2.task1;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        System.out.println("Number of doors: " + sedan.getNumberOfDoors());
        System.out.println("Trunk capacity: " + sedan.getTrunkCapacity());
        System.out.println("Fuel type: " + sedan.getFuelType());
        sedan.start();
        sedan.stop();

        System.out.println("\n\n");

        Car truck = new Truck();
        System.out.println("Number of doors: " + truck.getNumberOfDoors());
        System.out.println("Trunk capacity: " + truck.getTrunkCapacity());
        System.out.println("Fuel type: " + truck.getFuelType());
        truck.start();
        truck.stop();
    }
}
