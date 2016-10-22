
public class Prob8 {
    public static void main(String[] args) {
        int[] A = {1,3,5,7};
        int x = 6;
        System.out.println(findLowerBound(x, A));
    }
    public static int findLowerBound(int x, int[] A){
        int mid = 0;
        if(x > A[A.length -1])
            return -1;
        else{
            int low = 0;
            int high = A.length -1;
            while(low <= high){
                mid = (low + high)/2;
                if(A[mid] >= x)
                    break;
                else if(A[mid] < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return mid;
        
    }
}
