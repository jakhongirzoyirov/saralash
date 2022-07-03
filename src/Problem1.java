import static java.lang.Math.abs;

public class Problem1 {
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };
        System.out.println(problem1(arr));
    }

    private static int problem1(int[][] arr) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j]==1){
                    return abs(i-3)+ abs(j-3);
                }
            }
        }
        return -1;
    }
}