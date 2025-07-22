package TwoDArray;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(sumOfDiagonal(mat));
        System.out.println(mat[0][2]);
    }

    static int sumOfDiagonal(int[][] mat) {
        int num = 0;
        int len = mat.length;
        for (int i = 0; i <mat.length; i++) {
            num += mat[i][i];
            num += mat[i][len-i-1];
        }
        if(len%2==1){
            num-=mat[len%2][len%2];
        }
        return num;
    }
}

