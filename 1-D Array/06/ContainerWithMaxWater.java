public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int arr [] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // bruteForce O(n^2)
        /* 
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int min =0;
                if(arr[i]>arr[j]){
                    min = arr[j];
                } else if(arr[j]>arr[i]){
                    min = arr[i];
                }else{
                    min = arr[i];
                }
                int width = j-i;
                int area = min*width; // min becomes wall height of conatiner
                System.out.println(i+" "+j+" Area: "+area);
                if(area>maxArea){
                    maxArea = area;
                }
            }
        }
        */

        

        // Optimal Approach O(n)
        /*
        int maxArea = Integer.MIN_VALUE;
        int left =0;
        int right = arr.length -1;
        while(left<right){
            int area = (Math.min(arr[left], arr[right]))*(right-left);
            if(area>maxArea){
                maxArea = area;
            }

            if(arr[left]<arr[right]){
                left++;
            } else if(arr[left]==arr[right]){
                left++;
            } else{
                right--;
            }
        }
        System.out.println(maxArea);
        */


    }
}
