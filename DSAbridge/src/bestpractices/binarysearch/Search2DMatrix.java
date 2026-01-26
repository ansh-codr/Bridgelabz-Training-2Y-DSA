package bestpractices.binarysearch;

import java.util.Scanner;

public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix (sorted rows, first > last of prev row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int left = 0;
        int right = rows * cols - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int val = matrix[row][col];
            
            if (val == target) {
                found = true;
                System.out.println("Found at row " + row + ", column " + col);
                break;
            } else if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Target not found: false");
        } else {
            System.out.println("Result: true");
        }
        
        sc.close();
    }
}
