import java.util.Arrays;
import java.util.Scanner;

public class pb4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int numOfProblems = 0;
        int [][]arr;
        n = scanner.nextInt();
        arr = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
            if(Arrays.stream(arr[i]).sum() >= 2) {
                numOfProblems++;
            }
        }
        System.out.println(numOfProblems);
        scanner.close();
    }
}
