package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int i;
        for(i=0;i<10;i++){
            a.add(input.nextInt());
        }
        for(i=0;i<10;i++){
            System.out.println(a.get(i));
        }
    }
}
