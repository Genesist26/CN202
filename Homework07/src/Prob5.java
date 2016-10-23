
public class Prob5 {
    public static void main(String[] args) {
        int[] A = {-1,0,1,2,4};
        System.out.println(findFixedPoint(A));
    }
    public static boolean findFixedPoint(int[] A){
        int low;
        int high;
        int mid;
        low = 0;
        high = A.length-1;
        while(low <= high){
            mid = (low+high)/2;
            if(A[mid] == mid)
                return true;
            else if(A[mid] > mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        
        return false;
    }
}
