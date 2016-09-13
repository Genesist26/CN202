package Homework_03;

import java.util.Random;

public class TestRunningTime2 {

    public static double[] prefixAvg1(double[] X) {
        int n = X.length;
        double[] A = new double[n];
        for (int i = 0; i < n; i++) {
            double a = 0;
            for (int j = 0; j <= i; j++) {
                a = a + X[j];
            }
            A[i] = a / (i + 1);
        }
        return A;
    }

    public static double[] prefixAvg2(double[] X) {
        int n = X.length;
        double[] A = new double[n];
        double s = 0;
        for (int i = 0; i < n; i++) {
            s = s + X[i];
            A[i] = s / (i + 1);
        }
        return A;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        long startTime, finishTime, runningTime1, runningTime2;
        long sumRunningTime1, sumRunningTime2;
        double avgRunningTime1, avgRunningTime2;
        
        sumRunningTime1 = sumRunningTime2 = 0;
        
        int n = 5;
        int repeatPern = 1000;//Integer.parseInt(args[0]);
        double[] X = new double[repeatPern];
        double[] Z = new double[repeatPern];
        // random value dataset
        for(int i = 0; i < n; i++){
            for(int j = 0; j < repeatPern; j++) // count per dataset
                X[i] = rand.nextDouble();
            
            startTime = System.nanoTime();
                Z = prefixAvg1(X);
                finishTime = System.nanoTime();
       runningTime1 = finishTime - startTime;
       sumRunningTime1 += runningTime1;
                
                
                startTime = System.nanoTime();
                Z = prefixAvg2(X);
                finishTime = System.nanoTime();
       runningTime2 = finishTime - startTime;
       sumRunningTime2 += runningTime2;
            
            
        }
        avgRunningTime1 = (double) sumRunningTime1/n;
        avgRunningTime2 = (double) sumRunningTime2/n;
        System.out.println("avgRunningTime1 = " + avgRunningTime1 + " ns");
        System.out.println("avgRunningTime2 = " + avgRunningTime2 + " ns");

    }
}
