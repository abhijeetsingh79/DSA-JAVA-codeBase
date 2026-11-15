import java.util.Arrays;

public class uniqueElement {
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,4,5,7,7,7,9};
        int unique[] = new int[arr.length];
        int idx =0;  // Very Useful

        for(int i=0;i<arr.length; i++){
            boolean check = false;

            for(int j=0; j<arr.length; j++){
                if(j!=i){
                    if(arr[j]==arr[i]){
                        check = true;
                        break;
                    }
                }
            }
            if(!check){
                unique[idx] = arr[i];
                idx++;
            }

        }

        int uniqueElement[] = new int[idx];
        for(int i=0; i<idx; i++){
            uniqueElement[i]= unique[i];
        }

        System.out.println(Arrays.toString(uniqueElement));
    }
}
