package bestpractices.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        
        String r = sb.toString();
        System.out.println("Without duplicates: " + r);
        
        sc.close();
    }
}
