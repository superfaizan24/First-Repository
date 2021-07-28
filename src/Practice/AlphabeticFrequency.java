package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        char s[] = word.toCharArray();
        Arrays.sort(s);
        int i;
        int j = s[0];
        int count = 1;
        for (i = 0; i < s.length - 1; i++) {
            if (s[i] == s[i + 1]) {
                count++;
            } else {
                System.out.println(s[i]  + ""+ count);
                count = 1;
                ;
            }
        }
        if (s[s.length - 1] == s[s.length - 2])
            System.out.println(s[s.length - 1] +"" + count);
        else
            System.out.println(s[s.length-1]+ "" +1);



    }
}