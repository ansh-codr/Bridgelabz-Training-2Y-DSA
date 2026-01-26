import java.util.Scanner;

class BMIReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = 10;
            double[][] d = new double[n][2];
            for (int i = 0; i < n; i++) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                if (w <= 0 || h <= 0) {
                    System.out.println("Invalid. Enter again.");
                    i--;
                    continue;
                }
                d[i][0] = w;
                d[i][1] = h;
            }
            System.out.println("Height\tWeight\tBMI\tStatus");
            for (int i = 0; i < n; i++) {
                double hM = d[i][1] / 100.0;
                double bmi = d[i][0] / (hM * hM);
                bmi = Math.round(bmi * 100.0) / 100.0;
                String st;
                if (bmi < 18.5) st = "Underweight";
                else if (bmi < 25.0) st = "Normal";
                else if (bmi < 30.0) st = "Overweight";
                else st = "Obese";
                System.out.println(d[i][1] + "\t" + d[i][0] + "\t" + bmi + "\t" + st);
            }
        } catch (RuntimeException e) {
            System.out.println("Invalid input.");
        } finally {
            sc.close();
        }
    }
}
