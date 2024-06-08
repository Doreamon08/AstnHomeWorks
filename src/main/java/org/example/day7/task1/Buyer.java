package org.example.day7.task1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Buyer implements Runnable, IBuyer, IUseBasket {
    private static final List<Good> GOODS = Arrays.asList(
            new Good("Milk", 1.5),
            new Good("Bread", 1.0),
            new Good("Apple", 0.5),
            new Good("Cheese", 2.5)
    );

    private Basket basket;

    @Override
    public void run() {
        try {
            enterToMarket();
            takeBasket();
            chooseGoods();
            putGoodsToBasket();
            goOut();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterToMarket() {
        System.out.println(Thread.currentThread().getName() + " entered the market.");
    }

    @Override
    public void chooseGoods() throws InterruptedException {
        int timeToChoose = ThreadLocalRandom.current().nextInt(500, 2001);
        Thread.sleep(timeToChoose);
        System.out.println(Thread.currentThread().getName() + " chose goods in " + timeToChoose + " ms.");
    }

    @Override
    public void goOut() {
        System.out.println(Thread.currentThread().getName() + " left the market.");
    }

    @Override
    public void takeBasket() {
        basket = new Basket();
        System.out.println(Thread.currentThread().getName() + " took a basket.");
    }

    @Override
    public void putGoodsToBasket() throws InterruptedException {
        int numberOfGoods = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < numberOfGoods; i++) {
            int timeToPut = ThreadLocalRandom.current().nextInt(500, 2001);
            Thread.sleep(timeToPut);
            Good good = GOODS.get(ThreadLocalRandom.current().nextInt(GOODS.size()));
            basket.addGood(good);
            System.out.println(Thread.currentThread().getName() + " put " + good + " into the basket in " + timeToPut + " ms.");
        }
        System.out.println(Thread.currentThread().getName() + " finished choosing goods: " + basket);
    }
}
