package DayTwo;

import java.util.Scanner;

public class pb10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int numOfMonth = 0, acc = 0;
        int []arr = new int[12];
        for(int i = 0; i < 12; i++) {
            arr[i] = scanner.nextInt();
        }
        if(k == 0) {
            System.out.println(0);
            scanner.close();
            return;
        }
        for(int i = 0; i < 12; i++) {
            int max = 0, maxIndex = 0;
            for(int j = 0; j < 12; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            acc += max;
            numOfMonth++;
            arr[maxIndex] = 0;
            if(acc >= k) {
                break;
            }
        }

        if(acc >= k) {
            System.out.println(numOfMonth);
        }
        else {
            System.out.println(-1);
        }
        scanner.close();
    }
}
