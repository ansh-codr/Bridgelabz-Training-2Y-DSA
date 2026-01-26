package bestpractices.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("No negative number found");
        } else {
            System.out.println("First negative number at index: " + index);
            System.out.println("Value: " + arr[index]);
        }
        
        sc.close();
    }
}
