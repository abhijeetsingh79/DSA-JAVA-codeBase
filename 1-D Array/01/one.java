import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class one {

    static int[] swapAlternateElements(int [] arr){
        // int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length-1; i+=2){
            int first = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = first;
        }
        return arr;
    }


    static int[] intersetionElementsIn2Arrays(int[] arr1, int[] arr2){
        // int []arr;

        // if(arr1.length<arr2.length){
        //     arr = new int[arr1.length];  // if we declare arr here so accessibel arr in side that block only
        // } else{
        //     arr = new  int[arr2.length];  // we want glogal access within fn;
        // }

        ArrayList<Integer> list = new ArrayList<>();
        
        // int idx =0;
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    // arr[idx] = arr1[i];
                    list.add(arr1[i]);
                    // idx++;
                    break;
                }
            }
        }

        int[] arrFinal = new int[list.size()];
        int idx =0;
        for(int x: list){
            arrFinal[idx] = x;
            idx++;
        }

        return arrFinal;
    }


    static void printExtremeElements(int arr[]){
        for(int i=0; i<((arr.length)/2); i++){
            System.out.println(arr[i]+" Last: "+ arr[arr.length-i-1]);
            
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {2,3,9,1,0};
        int[] array = {3,9,8,7,3,1};
        swapAlternateElements(arr);
        System.out.println(Arrays.toString(arr));
        
        int[] ansArr = intersetionElementsIn2Arrays(arr, array);
        System.out.println(Arrays.toString(ansArr));

        printExtremeElements(array);
    }
}
