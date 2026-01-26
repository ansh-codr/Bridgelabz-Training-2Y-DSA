package bestpractices.stringbuilder;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        
        String r = sb.toString();
        System.out.println("Reversed: " + r);
        
        sc.close();
    }
}
