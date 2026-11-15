public class kadaneAlgorithm {
    public static void main(String[] args) {
        int [] arr = {-3,-4,-8,-1,-6};

        // result of max sub array;

        int sum =0;
        int maxSum = Integer.MIN_VALUE;
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
