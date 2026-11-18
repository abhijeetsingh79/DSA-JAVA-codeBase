public class binaryExponentiation {
    public static void main(String[] args) {
        // int n=13;  // to get last binary digit n%2 and n =n/2;  bcz binary t deciaml ham 2 se multiply kar ke karte hai
        // while(n!=0){
        //     System.out.println(n%2);
        //     n = n/2;
        // }

        int x =3;
        int n =4;
        int ans =1;
        while(n!=0){
            if(n%2==1){
                ans = ans*x;
            }
            x = x*x;
            n = n/2;
        }

        System.out.println(ans);
    }
}
