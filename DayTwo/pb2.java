package DayTwo;

import java.util.Scanner;

public class pb2 {
    // s1*s2 = a1, s2*s3 = a2, s3*s1 = a3
    // s1/s3 = a1/a2 -> a3/s1^2 = s3/s1 -> a1a3/a2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble(), a2 = scanner.nextDouble(), a3 = scanner.nextDouble();
        double s1 = (int)Math.sqrt((double) (a3 * a1) /a2),s2 = a1/s1, s3 = a2/s2;
        System.out.println((int)(s1*4 + s2*4 + s3*4));
        scanner.close();
    }
}
