public class kadanesAlgo {
    public static void main(String[] args) {
        
        int arr[] = {-2,-3,1,2,3};

        // brute force  // O(n^3)

        // int maxSum =Integer.MIN_VALUE;
        // for(int k=0; k<arr.length; k++){
        //     int start=k;
        //     int end= arr.length-1; 
        //     while (start<=end) {
        //         int sum =0;
        //         for(int i=start; i<=end; i++){
        //             sum+=arr[i];
        //         }
        //         if(sum>maxSum){
        //             maxSum = sum;
        //         }
        //         // System.out.println(sum);
        //         end--;
        //     }
        // }
        // System.out.println(maxSum);


        // better approach O(n^2)

        // int maxSum =Integer.MIN_VALUE;

        // for(int i=0; i<arr.length; i++){
        //     int currSum =0;
        //     for(int j=i; j<arr.length; j++){
        //         currSum+= arr[j];
        //         if(currSum>maxSum){
        //             maxSum = currSum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        
        // optimal Approach O(n)

        int maxSum = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }

            if(sum<0){
                sum =0;
            }
        }
        System.out.println(maxSum);
    }
}
