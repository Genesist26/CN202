
public class Prob4 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int z = 5;
        System.out.println(findSum(A, z));
        
    }
    public static boolean findSum(int[] A, int z){
        int diff;
        int low;
        int high;
        int mid;
        
        for(int i=0; i<A.length;i++){
            diff = z - A[i];
            low = 0;
            high = A.length - 1;
            
            while(low <= high){
                mid = (low+high)/2;
                if(diff == mid)
                    return true;
                else if(A[mid] > diff)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }  
        return false;
    }
}
