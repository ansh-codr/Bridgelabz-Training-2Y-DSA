package bestpractices.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
        
        String r = sb.toString();
        System.out.println("Concatenated: " + r);
        
        sc.close();
    }
}
