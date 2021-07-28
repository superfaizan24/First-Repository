package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int size = scanner.nextInt();
        int a[] = new int [size];
        int i;
        System.out.println("Enter the values of the first array");
        for(i=0;i<size;i++){
            a[i]=scanner.nextInt();
        }
        int b[] = new int [size];
        System.out.println("Enter the values of the second array");
        for(i=0;i<size;i++){
            b[i]=scanner.nextInt();
        }
        HashMap<Integer,Integer> c = new HashMap<Integer,Integer>();
        for(i=0;i<size;i++){
            c.put(a[i],b[i]);
        }
        System.out.println(c);
    }
}
