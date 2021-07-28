package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        System.out.println("Enter the size of the arrays");
        int size = scanner.nextInt();
        int a[] = new int[size];
        int i;
        System.out.println("Enter the values of the first array");
        for(i=0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String b[] = new String[size];
        System.out.println("Enter the values of the second array");
        for(i=0;i<size;i++){
            b[i] = scanner.nextLine();
        }
        for(i=0;i<size;i++){
            map.put(a[i],b[i]);
        }
        System.out.println(map);
    }
}
