public class removeDuplicatesSortedArr {
    public static void main(String[] args) {
        int[] nums = {1,1,2};

        // only for count
        // int prv = nums[0];
        // int count =1;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]!=prv){
        //         prv = nums[i];
        //         count++;
        //     }
        // }

        // System.out.println(count);


        // for inplace replacement

        int i=0;
        int j=1;
        int n = nums.length;

        while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            } else{
                j++;
            }
        }

        System.out.println("No of unique: "+(i+1));
        System.out.println("");
    }
}
