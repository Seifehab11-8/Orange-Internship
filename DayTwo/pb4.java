package DayTwo;

import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        boolean isLucky = true;
        while (temp != 0) {
            if((temp % 10 != 4) && (temp % 10 != 7)) {
                isLucky =false;
                break;
            }
            temp/=10;
        }

        if(!isLucky) {
            if(n % 4 == 0 || n % 7 == 0 || n % 47 == 0 || n % 74 == 0) {
                isLucky = true;
            }
        }
        if(isLucky) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
