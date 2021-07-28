package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MaximumElementHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers and enter -1 to stop");
        int number;
        Set<Integer> hs=new HashSet<>();
        do{
            number=scanner.nextInt();
            if(number!=-1)
                hs.add(number);
        }while(number!=-1);

        int max=Integer.MIN_VALUE;
//        Iterator<Integer> itr = hs.iterator();
//        while(itr.hasNext()){
//            int element=itr.next();
//            if(element>max)
//                max=element;
//        }
        for(int x:hs){  // Enhanced for loop
            if(x>max)
                max=x;
        }
        System.out.println(max);
        }
    }

