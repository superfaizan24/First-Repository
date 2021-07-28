package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        HashSet<Integer> hs = new HashSet<Integer>();
        n=scanner.nextInt();
        while (n!=-1){
            hs.add(n);
            n=scanner.nextInt();
        }
        System.out.println(hs);
    }

}

