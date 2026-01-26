package bestpractices.challenge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareAllClasses {
    public static void main(String[] args) {
        int n = 1000000;
        
        System.out.println("=== StringBuilder vs StringBuffer ===");
        
        StringBuilder sb1 = new StringBuilder();
        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb1.append("hello");
        }
        long t2 = System.nanoTime();
        long time1 = t2 - t1;
        System.out.println("StringBuilder time: " + time1 + " ns");
        
        StringBuffer sb2 = new StringBuffer();
        long t3 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        long t4 = System.nanoTime();
        long time2 = t4 - t3;
        System.out.println("StringBuffer time: " + time2 + " ns");
        
        System.out.println("\n=== FileReader vs InputStreamReader ===");
        
        String file = "largefile.txt";
        
        int count1 = 0;
        long t5 = System.nanoTime();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count1 += words.length;
            }
            
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        long t6 = System.nanoTime();
        long time3 = t6 - t5;
        System.out.println("FileReader word count: " + count1);
        System.out.println("FileReader time: " + time3 + " ns");
        
        int count2 = 0;
        long t7 = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count2 += words.length;
            }
            
            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        long t8 = System.nanoTime();
        long time4 = t8 - t7;
        System.out.println("InputStreamReader word count: " + count2);
        System.out.println("InputStreamReader time: " + time4 + " ns");
    }
}
