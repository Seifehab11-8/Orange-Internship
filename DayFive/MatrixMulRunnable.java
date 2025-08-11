package org.example;

import java.util.ArrayList;

public class MatrixMulRunnable implements Runnable{
    public static ArrayList<ArrayList<Integer>> matrixA;
    public static ArrayList<ArrayList<Integer>> matrixB;
    public static ArrayList<ArrayList<Integer>> matrixC;
    private final int A;
    private final int B;

    public MatrixMulRunnable(int A, int B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public void run() {
        for(int i = 0; i < matrixA.getFirst().size(); i++) {
            matrixC.get(A).set(B, matrixC.get(A).get(B) + ((matrixA.get(A).get(i))*(matrixB.get(i).get(B))));
        }
    }
}
/*
NxM
MxP
 */
