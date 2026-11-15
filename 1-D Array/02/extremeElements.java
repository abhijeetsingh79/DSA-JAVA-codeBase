public class extremeElements {
    public static void main(String[] args) {
        int [] arr = {3,5,6,8,9,7};
        
        int i=0; 
        int j=arr.length -1;

        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
            }else{
                System.out.println(arr[i]);
                System.out.println(arr[j]);
            }
            
            i++;
            j--;
        }
    }
}
