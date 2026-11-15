import java.util.*;
public class uniqueElementsInArray {
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,4,5,7,7,7};

        int unique[] = new int[arr.length];
        int idx =0;

        for(int i=0; i<arr.length; i++){
            int element =arr[i];
            boolean checkExist =false;

            for(int j=0; j<idx; j++){
                if(element==unique[j]){
                    checkExist = true;
                }
            }
            if(!checkExist){
                unique[idx]=element;
                idx++;
            }

        }
        System.out.println(Arrays.toString(unique));
    }
}
