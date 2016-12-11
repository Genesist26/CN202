/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob8;

/**
 *
 * @author somsa
 */
public class FindLowerBound {

    public static void main(String[] args) {
        int[] A = {1, 3, 3, 3, 5, 7, 9};
        System.out.println(findLowerBound(3, A, 0, A.length-1));

    }

    public static int findLowerBound(int x, int[] A, int low, int high) {
        if(low == high)
            return (low+high)/2;

        if (low <= high) {
            int mid = (low + high) / 2;
            if (low == high) {
                return mid;
            }
            if (A[mid] > x) {
                return findLowerBound(x, A, low, mid - 1);
            } else {
                return findLowerBound(x, A, mid + 1, high);
            }

        }
        return -1;
    }
}

