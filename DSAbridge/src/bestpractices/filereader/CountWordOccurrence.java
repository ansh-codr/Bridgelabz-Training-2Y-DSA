package bestpractices.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = sc.nextLine();
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        
        int count = 0;
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(word)) {
                        count++;
                    }
                }
            }
            
            br.close();
            fr.close();
            
            System.out.println("Word '" + word + "' found " + count + " times");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}
