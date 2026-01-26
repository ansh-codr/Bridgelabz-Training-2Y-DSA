package bestpractices.inputstreamreader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserInputToFile {
    public static void main(String[] args) {
        String file = "output.txt";
        
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(file);
            
            System.out.println("Enter text (type 'exit' to stop):");
            
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    break;
                }
                fw.write(line + "\n");
            }
            
            fw.close();
            br.close();
            isr.close();
            
            System.out.println("Input saved to " + file);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
