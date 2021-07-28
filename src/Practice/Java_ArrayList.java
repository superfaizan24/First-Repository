package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //
        System.out.println("Enter the number of lines");
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(n);
        int i;
        int j;
        for (i = 0; i < n; i++) {
            int ne = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<>(ne);
            for (j = 0; j < ne; j++) {
                a.add(scanner.nextInt());
            }
            al.add(a);
        }


        int queries[][] = new int[n][2];
        for (i = 0; i < n; i++)
            for (j = 0; j < 2; j++)
                queries[i][j] = scanner.nextInt();

//        for (i = 0; i < n; i++) {
//            try {
//                System.out.println(al.get(queries[i][0] - 1).get(queries[i][1] - 1)); // x=queries[i][0] and y=queries[i][1]
//            }
//            catch(IndexOutOfBoundsException e){
//                System.out.println("ERROR!");
//            }
//
//        }
        for(i=0;i<n;i++)
            if(queries[i][0]>0 && queries[i][0]<=al.size() && queries[i][1]>0 && queries[i][1]<=al.get(queries[i][0] - 1).size())
                System.out.println(al.get(queries[i][0] - 1).get(queries[i][1] - 1));
            else
                System.out.println("ERROR!");

    }
}