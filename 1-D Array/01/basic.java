import java.sql.Array;
import java.util.Arrays;

public class basic {
    
        // used static so it can be directly accessed with class name; no need o create objec to access it
        static double getAvg(int[][] arr){
            int sum = 0;
            int count =0;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    sum+= arr[i][j];
                    count++;
                }
            }
            return (((double)sum)/count);
        }


        static int[] multiplyBy10(int []arr){
            for(int i=0; i<arr.length; i++){
                arr[i] = arr[i]*10;
            }
            return arr;
        }

        static boolean findTarget(int arr[], int target){
            for(int i=0; i<arr.length; i++){
                if(arr[i]==target){
                    return true;
                }
            }
            return false;
        }


        static int findMax(int arr[]){
            int max = arr[0];

            for(int i=0; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }


        static int returnSum(int[] arr){
            int sumP =0;
            int sumN=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]<0){
                    sumN+=arr[i];
                } else{
                    sumP+=arr[i];
                }
            }
            return sumN+sumP;
        }
        

        static int[] ZeroOnesCount(int[] arr){
            int countZ=0;
            int countO=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==0){
                    countZ++;
                }else if(arr[i]==1){
                    countO++;
                }
            }
            int[] arr2 = {countZ, countO};
            return arr2;
        }

        static int returnFirstUnsorted(int arr[]){
            for(int i=0; i<arr.length-1; i++){
                if(!(arr[i+1]>arr[i])){
                    return arr[i+1];
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[][] arr2 = {{8,2,9},{6,3,9}};
            System.out.println(getAvg(arr2));

            int[] arr3 = {4,57,8,9,0};
            multiplyBy10(arr3);
            
            System.out.println(findTarget(arr3, 4));
            System.out.println(findMax(arr3));

            System.out.println(Arrays.toString(arr3));
            System.out.println(findMax(arr3));

            int[] arr5 = {20,-3,4,-9,6,8};
            System.out.println(returnSum(arr5));

            int[] arr6 = {0,1,0,0,0,1};
            int[] arr7 = ZeroOnesCount(arr6);
            System.out.println("Zero :"+arr7[0]+" Ones :"+ arr7[1]);


            int[] arr8 = {1,2,3,4,5,77,4,99};
            System.out.println(returnFirstUnsorted(arr8));

        }

}
