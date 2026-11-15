import java.lang.reflect.Array;
import java.util.Arrays;

public class sort0and1 {

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,0,1,1};

        int i=0; 
        int j=arr.length -1;

        while(i<j){
            if(arr[i]==1){
                if(arr[j]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                } else{
                    j--;
                }
            } else{
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}