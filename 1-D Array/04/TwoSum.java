public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,7,11,15,9};
        int target = 12;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.err.println("1st is : "+i+" 2nd is : "+j);
                }
            }
        }

    }
    
}