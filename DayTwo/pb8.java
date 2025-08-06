package dayTwo;

import java.util.Scanner;

public class pb8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int numOfOccurence = 0;
        for(int i = 1; i <= n; i++) {
            if(x % i == 0 && (x/i) <= n) { // if x % i !=0 then it is impossible these i will have x
                // x/i checks if there exist another number j such that j*i = x
                numOfOccurence++;
            }
        }

        System.out.println(numOfOccurence);
        scanner.close();
    }
}

/*
        1 2 3 4 5 6
        2 4 6 8 10
        3 6 9 12
        4 8 12 16
        5 10
        6
 */