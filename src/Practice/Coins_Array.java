package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Coins_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount");
        int amount = input.nextInt();
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 7;
        int i;
        int s=0;
        if(amount/d<1){
            if(amount/c<1){
                if(amount/b<1){
                    s=a;
                }
                else{
                    b=a;
                }
            }
            else{
                d=s;
            }
        }
        else{
            d=s;
        }
        System.out.println(s);
    }

}
