
public class Prob7 {
    public static void main(String[] args) {
        int[][] A = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        System.out.println(countOne(A));
    }
    public static int countOne(int[][] A){
        int one = 0;
        int low;
        int high;
        int mid = 0;
        
        for(int i=0; i<A.length; i++){
            low = 0;
            high = A.length-1;
            
            while(low <= high){
                mid = (low+high)/2;
                
                if(low == high){
                    if(A[i][mid] == 0)
                        System.out.println("0");
                    else if(A[i][mid] == 1)
                        System.out.println("1");
                    break;
                    
                }
                else if(A[i][mid] == 0)
                    high = mid - 1;
                else if(A[i][mid] == 1){
                    low = mid + 1;
                }
                
            }
        }
        return one;
    }
}
/*
                if((low == mid) & A[i][mid] == 0)
                    one += mid;
                
                else if(A[i][mid] == 0)
                    high = mid - 1; 
                else if(A[i][mid] == 1)
                    low = mid + 1;
                else if((low == high) && A[i][mid] == 0)
                    one += mid;
                else if((low == high) && A[i][mid] == 1)
                    one += low +1;
*/