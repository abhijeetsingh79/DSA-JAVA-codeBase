public class uniqueElement {
    public static void main(String[] args) {
        int [] nums = {2,3,5,4,5,3,4};

        int xor =0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }

        System.out.println(xor);

    }
}
