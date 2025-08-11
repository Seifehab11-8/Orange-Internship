package DayTwo;

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] board = new char[n][n];
        boolean check = true;
        int evenCheck = 0;
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for(int j = 0; j < n; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((i - 1) >= 0) {
                    if(board[i-1][j] == 'o') evenCheck++;
                }
                if((i + 1) < n) {
                    if(board[i+1][j] == 'o') evenCheck++;
                }
                if((j - 1) >= 0) {
                    if(board[i][j-1] == 'o') evenCheck++;
                }
                if((j + 1) < n) {
                    if(board[i][j+1] == 'o') evenCheck++;
                }
                if(evenCheck % 2 == 1) {
                    check = false;
                    break;
                }
                evenCheck = 0;
            }
            if(!check) break;
        }

        if(check) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
