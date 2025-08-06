package dayTwo;

import java.util.Scanner;

public class pb9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = Math.abs(scanner.nextInt());
        long y = Math.abs(scanner.nextInt());
        long s = scanner.nextInt();

        if(s == x+y) {
            System.out.println("Yes");
        }
        else if (s > x + y){
            if((s - (x+y)) % 2 == 0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
        scanner.close();
    }
}
