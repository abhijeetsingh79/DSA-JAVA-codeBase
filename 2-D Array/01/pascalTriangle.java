import java.util.ArrayList;

public class pascalTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n=7;
        for(int i=0; i<n; i++){
            if(i==0){
                ArrayList<Integer> l1 = new ArrayList<>();
                l1.add(1);
                list.add(l1);  // staring mein only 1 add
            } else{
                ArrayList<Integer> l1 = new ArrayList<>();
                l1.add(1);
                    if(list.get(i-1).size()>=2){
                        for(int j=0; j<list.get(i-1).size()-1; j++){  // prv ke har ke sath l.get(j)+l.get(j-1) sum only if prv size>=2;
                            l1.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
                        }
                    }
                l1.add(1);
                list.add(l1);
            }
        }

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

        /*
                    1 
            1                1 
            1       2        1 
            1    3      3    1 
            1  4    6     4  1 
            1       .        1 
            1       .        1 
            1       .        1 
        */
    }
}
