package bestpractices.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String file = "input.txt";
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
