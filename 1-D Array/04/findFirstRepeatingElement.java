import java.util.HashMap;

public class findFirstRepeatingElement {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,4,4,5,6,6};
         HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i], 1);
        } else{
            map.put(nums[i], map.get(nums[i])+1);
        }
    }

    for(int i=0; i<nums.length; i++){
        if(map.get(nums[i])>1){
            System.out.println(nums[i]);
            break;

        }
    }

    
    }
}
