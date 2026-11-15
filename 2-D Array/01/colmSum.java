import java.sql.Array;
import java.util.Arrays;

public class colmSum {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        int []sum = new int[arr[0].length];

        for(int i=0; i<arr[0].length; i++){
            int colSum =0;
            for(int j=0; j<arr.length; j++){
                colSum+= arr[j][i];
            }
            sum[i] = colSum;
        }
        System.out.println(Arrays.toString(sum));
    }
}
