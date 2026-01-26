package bestpractices.challenge;

import java.util.Scanner;

public class LinearBinaryChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\n=== Linear Search: First Missing Positive ===");
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        boolean[] present = new boolean[max + 2];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                present[arr[i]] = true;
            }
        }
        
        int missing = -1;
        for (int i = 1; i < present.length; i++) {
            if (!present[i]) {
                missing = i;
                break;
            }
        }
        
        System.out.println("First missing positive: " + missing);
        
        System.out.println("\n=== Binary Search: Find Target Index ===");
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        
        int left = 0;
        int right = n - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Target index: " + index);
        
        sc.close();
    }
}
