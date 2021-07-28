package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java_Map {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> a = new HashMap<>(n);
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            a.put(name,phone);
        }
//        while (in.hasNext()) {
//            String s = in.nextLine();
//        }
        System.out.println(a);
    int i;
    ArrayList<String> s=new ArrayList<>(n);
    for(i=0;i<n;i++){
        s.add(in.nextLine());
    }
        for(i=0;i<n;i++){
            if(a.containsKey(s.get(i))){
                System.out.println(s.get(i)+"="+a.get(s.get(i)));
            }
            else
                System.out.println("Not Found");
        }
    }
}
