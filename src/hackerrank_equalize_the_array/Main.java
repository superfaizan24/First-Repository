package hackerrank_equalize_the_array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.println(Solution.equalizeArray(arr));
    }
}
