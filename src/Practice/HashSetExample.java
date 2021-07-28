package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers to input");
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        HashSet<Integer> b = new HashSet<Integer>();
        int i;
        for(i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        for(i=0;i<n;i++){
            b.add(a.get(i));
        }

        System.out.println(b);
    }
}
