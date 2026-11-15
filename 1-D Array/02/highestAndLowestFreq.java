import java.util.HashMap;

public class highestAndLowestFreq {
    public static void main(String[] args) {
        int[] arr = {4,4,5,5,6,7,7,88,4,3,2,5,6};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            } else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        int max_freq =-1;
        int max_no =-1;
        int min_freq =Integer.MAX_VALUE;
        int min_no =-1;
        for(int key: map.keySet()){
            if(map.get(key)>max_freq){
                max_freq = map.get(key);
                max_no = key;
            }
            if(map.get(key) < min_freq){
                min_freq = map.get(key);
                min_no = key;
            }
        }
        System.out.println("Max freq number: "+max_no);
        System.out.println("Min freq number: "+min_no);
    }
}
