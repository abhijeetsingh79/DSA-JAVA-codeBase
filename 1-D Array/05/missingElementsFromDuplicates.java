public class missingElementsFromDuplicates {

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,6};
        // find repated and missing;
        int repeated = -1;

        for(int i=0; i<arr.length; i++){
            int val = Math.abs(arr[i]);
            int idx = val -1;
            
            if(arr[idx]>0){
                arr[idx] = -arr[idx];
            } else{
                // get repeated bcz vo val pehle hi egtive hai use fir se koi value negative kar rhi hai so vo val is repated
                repeated = val;
            }
        }


        int missing =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                missing = i+1;
                break;
            }
        }

        System.out.println("repeated: "+repeated+" Missing: "+missing);
    }
}