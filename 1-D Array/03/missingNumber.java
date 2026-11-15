public class missingNumber {
    public static void main(String[] args) {
        int n = 4;
        int[] nums ={0,4,2,1};
        int idx =0;

        // using xor
        int missing_no =0;

        for(int i=0; i<nums.length; i++){
            missing_no = missing_no ^ nums[i];
        }

        for(int i=0; i<=n; i++){
            missing_no = missing_no ^ n;
        }

        System.out.println(missing_no);
    }
}
