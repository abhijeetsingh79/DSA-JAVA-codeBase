public class pairSum {
    public static void main(String[] args) {
        int numbers[]= {2,4,6,7};
        int target = 9;
        int i=0;
        int j= numbers.length-1;

        // O(n)
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                System.out.println(i+ " "+j);
                break;
            } else if(numbers[i]+numbers[j]>target){
                j--;
            } else{
                i++;
            }
        }

    }
}
