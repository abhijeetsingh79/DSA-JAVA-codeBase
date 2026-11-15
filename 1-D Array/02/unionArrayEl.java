import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class unionArrayEl {
    public static void main(String[] args) {
        int [] arr ={2,3,4,4};
        int[] arr2 = {2,6,4};
        
        ArrayList<Integer> al = new ArrayList<>();
        int union[] = new int[(arr.length+arr2.length)];
        int idx =0;

        for(int i=0; i<arr.length; i++){
                    boolean exists = false;
                    for(int k=0; k<union.length; k++){
                        if(arr[i] == union[k]){
                            exists = true;
                        }
                    }

                    if(!exists){
                        union[idx] = arr[i];
                        idx++;
                    }

                }

                for(int i=0; i<arr2.length; i++){
                    boolean exists = false;
                    for(int k=0; k<union.length; k++){
                        if(arr2[i] == union[k]){
                            exists = true;
                        }
                    }

                    if(!exists){
                        union[idx] = arr2[i];
                        idx++;
                    }

                }
                
        System.out.println(Arrays.toString(union));  // has 0 which are not there
    }
}
