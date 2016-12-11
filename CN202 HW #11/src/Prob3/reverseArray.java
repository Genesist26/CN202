
package Prob3;


public class reverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,8,9};
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i]+" ");
        }
        reverseArray(a,0,6);
        System.out.println("");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void reverseArray(int[] A, int low, int high){
        if(low < high){
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            reverseArray(A, low+1, high-1);
        }
    }
}
