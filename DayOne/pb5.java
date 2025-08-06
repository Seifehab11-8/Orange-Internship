package DayOne;
import java.util.Scanner;

public class pb5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tr_row = 0, tr_col = 0;
        int moves = 0;
        int [][]matrix = new int[5][5];
        for(int i = 0 ; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] == 1) {
                    tr_row = i+1;
                    tr_col = j+1;
                }
            }
        }
        if(tr_row > 3) {
            moves += (tr_row - 3);
        }
        else if(tr_row < 3) {
            moves += (3 - tr_row);
        }

        if(tr_col > 3) {
            moves += (tr_col - 3);
        }
        else if(tr_col < 3) {
            moves += (3 - tr_col);
        }

        System.out.println(moves);
        scanner.close();
    }
}
