package DayTwo;

import java.util.Scanner;

public class pb7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1, r = n;
        if (n == 1 || n == 2) {
            System.out.println(1);
            System.out.println(1);
            scanner.close();
            return;
        } else if (n == 4) {
            System.out.println(4);
            System.out.println(3 + " " + 1 + " " + 4 + " " + 2);
            scanner.close();
            return;
        } else if (n == 3) {
            System.out.println(2);
            System.out.println(1 + " " + 3);
            scanner.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = l;
                l++;
            } else {
                arr[i] = r;
                r--;
            }
        }
        int temp = arr[n - 1];
        arr[n - 1] = arr[0];
        arr[0] = temp;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
