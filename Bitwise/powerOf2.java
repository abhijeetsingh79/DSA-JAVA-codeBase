public class powerOf2 {
    public static void main(String[] args) {
        int n=32;

        // int i=0;
        // int count=0;
        // while(i<=32){
        //     if((n&1)==1){
        //         count++;
        //     }
        //     n = n>>1;
        //     i++;
        // }

        // if(count==1){
        //     System.out.println("Power of 2");
        // } else{
        //     System.out.println("Not power of 2: "+ count);
        // }



        // approach 2
        if((n&(n-1))==0){
            System.out.println("Power of 2");
        } else{
            System.out.println("Npt a power of 2");
        }

    }
}
