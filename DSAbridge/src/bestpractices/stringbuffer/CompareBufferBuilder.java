package bestpractices.stringbuffer;

public class CompareBufferBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        
        StringBuilder sb1 = new StringBuilder();
        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb1.append("hello");
        }
        long t2 = System.nanoTime();
        long time1 = t2 - t1;
        
        StringBuffer sb2 = new StringBuffer();
        long t3 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        long t4 = System.nanoTime();
        long time2 = t4 - t3;
        
        System.out.println("StringBuilder time: " + time1 + " nanoseconds");
        System.out.println("StringBuffer time: " + time2 + " nanoseconds");
        
        if (time1 < time2) {
            System.out.println("StringBuilder is faster");
        } else {
            System.out.println("StringBuffer is faster");
        }
    }
}
