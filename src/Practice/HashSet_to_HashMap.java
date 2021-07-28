package Practice;

import java.util.*;

public class HashSet_to_HashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<Integer>();
        System.out.println("How many integers do you want to enter?");
        int n = input.nextInt();
        int i;
        System.out.println("Enter " + n + " integers");
        for(i=0;i<n;i++){
            a.add(input.nextInt());
        }
        List<Integer> numbersList = new ArrayList<Integer>(a);
        Collections.sort(numbersList, Collections.reverseOrder());
        a = new HashSet<>(numbersList);
        int keys = 1;
        HashMap<Integer,Integer> b = new HashMap<Integer,Integer>();
        for(int j:a){
            b.put(keys,j);
            keys++;
        }
        System.out.println(b);
    }
}
