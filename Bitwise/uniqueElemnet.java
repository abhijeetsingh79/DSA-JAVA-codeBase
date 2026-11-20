public class uniqueElemnet {
    public static void main(String[] args) {
        int[] arr = {10,24,17,24,10,13,17};

        int xor =0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];  // 0^no = no so start with 0;; and at last we will get result
        }
        System.out.println(xor);
    }
}
