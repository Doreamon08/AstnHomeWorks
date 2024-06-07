package org.example.day7.task1;

public class Good {
    String name;
    double price;

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Price: " + price + ")";
    }
}
