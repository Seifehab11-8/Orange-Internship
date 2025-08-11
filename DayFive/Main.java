package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void readFile(String path, ArrayList<ArrayList<Integer>> matrix) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int row = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            matrix.add(new ArrayList<>());
            String [] numbers = line.split(" ");
            for(int i = 0; i < numbers.length; i++) {
                matrix.get(row).add(Integer.parseInt(numbers[i]));
            }
            row++;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matA = new ArrayList<>(), matB = new ArrayList<>(), matC = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        try {
            readFile("/Users/seifehab/Desktop/txtFiles/txt1.txt", matA);
            readFile("/Users/seifehab/Desktop/txtFiles/txt2.txt", matB);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < matA.size(); i++) {
            matC.add(new ArrayList<>());
            for(int j = 0; j < matB.getFirst().size(); j++) {
                matC.get(i).add(0);
            }
        }

        MatrixMulRunnable.matrixA = matA;
        MatrixMulRunnable.matrixB = matB;
        MatrixMulRunnable.matrixC = matC;

        for(int i = 0; i < matA.size(); i++) {
            for(int j = 0; j < matB.getFirst().size(); j++) {
                executorService.execute(new MatrixMulRunnable(i, j));
            }
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.close();
        for(int i = 0; i < matC.size(); i++) {
            for(int j = 0; j < matC.getFirst().size(); j++) {
                System.out.print(matC.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}