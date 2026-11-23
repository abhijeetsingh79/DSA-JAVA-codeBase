import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class rowSum {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};

        int []sum = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int summ = 0;
            for(int j=0; j<arr[i].length; j++){
                summ += arr[i][j];
            }
            sum[i] = summ;
        }

        System.out.println(Arrays.toString(sum));

    }
}
