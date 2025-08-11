package DayTwo;

import java.util.Scanner;

public class pb6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []pairs = new int[n];
        boolean dayBegun = false;
        int breakCount = 0;
        int numOfSessions = 0;
        for(int i = 0; i < n; i++) {
            pairs[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(pairs[i] == 1) {
                dayBegun = true;
                numOfSessions++;
                if(breakCount == 1) {
                    numOfSessions++;
                }
                breakCount = 0;
            }
            else {
                if(dayBegun)
                    breakCount++;
            }
        }
        System.out.println(numOfSessions);
        scanner.close();
    }
}
