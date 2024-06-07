package org.example.day7.task1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Good> goods = new ArrayList<>();

    public void addGood(Good good) {
        goods.add(good);
    }

    @Override
    public String toString() {
        return "Basket" + goods.toString();
    }
}
