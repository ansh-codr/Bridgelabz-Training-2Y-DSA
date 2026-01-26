package bestpractices.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ByteToCharStream {
    public static void main(String[] args) {
        String file = "input.txt";
        
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
