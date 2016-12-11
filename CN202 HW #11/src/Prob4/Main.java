/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author somsa
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 6, 8, 9};
        System.out.println("array is sorted = " + isSorted(a, 7));
    }

    public static boolean isSorted(int[] a, int n) {
        return isSorted(a, n - 2, n - 1);
    }

    private static boolean isSorted(int[] b, int first, int last) {
        if (first < 0) {
            return true;
        }
        else if(b[last] >= b[first])
            return isSorted(b, first-1,last-1);
        else
            return false;
    }
}
