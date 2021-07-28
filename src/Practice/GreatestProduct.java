package Practice;

import java.util.Scanner;

public class GreatestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int a[] = new int [size];
        int i;
        System.out.println("Enter the values of the array");
        for(i=0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        int j;
        int k;

        for(i=0;i<size;i++){
            for(j=0;j<size-i-1;j++){
                if(a[j]>a[j+1]){
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.println(a[size-1]*a[size-2]);
    }
}
