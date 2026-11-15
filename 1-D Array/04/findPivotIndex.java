public class findPivotIndex {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,55};
         int n = nums.length;
        int [] leftSum = new int[n];
        int[] rightSum = new int[n];

        int lSum =0;
        for(int i=0; i<n; i++){
            lSum+= nums[i];
            leftSum[i] = lSum;
        }

        int rSum= 0;
        for(int i=n-1; i>=0; i--){
            rSum+= nums[i];
            rightSum[i] = rSum;
        }

        for(int i=0; i<n; i++){
            if(leftSum[i]==rightSum[i]){
                System.out.println(i);
                break;
            }
        }

        
    }
}
