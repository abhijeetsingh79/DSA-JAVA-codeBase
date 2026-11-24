public class transposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        int [][] arr2 = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr2[j][i] = arr[i][j]; 
            }
        }

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
