import java.util.HashMap;

public class modeOfArray {
    public static void main(String[] args) {

        // my soln
        int[] arr ={2,3,4,5,6,7,8,33,5,67,67,67};
        // int idx =0;
        // int max_freq =0;
        // for(int i=0; i<arr.length; i++){
        //     int count =0;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count>max_freq){
        //         max_freq = count;
        //         idx =i;
        //     }

        // }
        // System.out.println(arr[idx]);



        // by DS
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int x: arr){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                map.put(x, map.get(x)+1);
            }
        }

        int maxFreq = -1;
        int no =-1;
        for(int i: map.keySet()){
            System.out.println(i+" vaule "+ map.get(i));
            if(map.get(i)>maxFreq){
                maxFreq = map.get(i);
                no = i;
            }
        }

        System.out.println("Mode of Array: "+no);

    }
}
