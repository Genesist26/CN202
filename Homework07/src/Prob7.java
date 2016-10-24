
public class Prob7 {

    public static void main(String[] args) {
        int[][] A = {{1, 0, 0, 0}, {1, 1, 1, 0}, {1, 1, 0, 0}, {1, 0, 0, 0}};
        System.out.println(countOne(A));
    }

    public static int countOne(int[][] A) {
        int one = 0;
        int low;
        int high;
        int mid = 0;

        for (int i = 0; i < A.length; i++) {
            low = 0;
            high = A.length - 1;

            while (low <= high) {
                mid = (low + high) / 2;

                if ((low == high) && (high == mid) && (A[i][mid] == 0)) {
                    one += mid;
                    break;
                } else if ((low == mid) && (A[i][mid] == 0)) {
                    one += mid;
                    break;
                } else if ((low == high) && (high == mid) && (A[i][mid] == 1)) {
                    one += mid + 1;
                    break;
                } else if (A[i][mid] == 0) {
                    high = mid - 1;
                } else if (A[i][mid] == 1) {
                    low = mid + 1;
                }

            }
        }
        return one;
    }
}
