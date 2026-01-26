package bestpractices.binarysearch;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = n - 1;
        int peak = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);
            
            if (leftOk && rightOk) {
                peak = mid;
                break;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (peak != -1) {
            System.out.println("Peak element index: " + peak);
            System.out.println("Peak element: " + arr[peak]);
        } else {
            System.out.println("No peak element found");
        }
        
        sc.close();
    }
}
