package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
