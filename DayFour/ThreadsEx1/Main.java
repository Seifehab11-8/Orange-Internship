package org.example;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            executorService.execute(new Task(names));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.close();
        names.sort(null);
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}