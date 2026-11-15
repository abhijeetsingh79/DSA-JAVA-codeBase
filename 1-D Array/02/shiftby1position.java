import java.lang.reflect.Array;
import java.util.Arrays;

public class shiftby1position {

    public static void main(String[] args) {
        int [] arr = {3,5,6,8,9};

        int i=arr.length -1;

        int temp = arr[arr.length-1];
        while((i-1)>=0){
            arr[i] = arr[i-1];
            i--;
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
        // System.out.println(Character.isDigit(0));

    }
}