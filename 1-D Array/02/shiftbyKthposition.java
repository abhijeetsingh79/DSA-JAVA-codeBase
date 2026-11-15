import java.util.Arrays;

public class shiftbyKthposition {

    public static void main(String[] args) {
        int arr[] = {2,9,6,4,1};
        int k =4;
        int last[] = new int[k];
        int idx =0;
        int n = arr.length;

        for(int i=n-k; i<n; i++){
            last[idx] = arr[i];
            idx++;
        }
        

        int i=n-1; // pointer last idx
        while(i>=k){
            arr[i] = arr[i-k];
            i--;
        }
        // System.out.println(Arrays.toString(arr));


        for(int j=0; j<k; j++){
            arr[j] = last[j];
        }

        for(int x: arr){
            System.out.println(x);
        }
    }
}