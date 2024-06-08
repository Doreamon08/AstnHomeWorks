package org.example.day7.task1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MarketSimulation {
    private static final int SIMULATION_TIME_SECONDS = 120;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Random random = new Random();

        for (int i = 0; i < SIMULATION_TIME_SECONDS; i++) {
            int buyersCount = random.nextInt(3);
            for (int j = 0; j < buyersCount; j++) {
                executorService.execute(new Buyer());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
