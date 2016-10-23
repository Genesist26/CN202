
public class Prob6 {
    public static void main(String[] args) {
        int[] A = {35,42,5,15,27,29};
        int k = 2;
        System.out.println(findLargest1(A,k));
        System.out.println(findLargest2(A));
        
         
    }
    public static int findLargest1(int[] A, int k){
        if(k == 0)
            return A[A.length -1];
        else
            return A[k-1];
        
    }
    public static int findLargest2(int[] A){
        int low =0;
        int high = A.length -1;
        int mid;
        while(low <= high){
                mid = (low+high)/2;
                if(A[mid] == 5){
                    if(mid == 0)
                        return A[5];
                    else
                        return A[mid-1];
                }
                else if(A[mid] > 42)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        return 0;
    }
}
