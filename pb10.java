import java.util.Scanner;

public class pb10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGroups = 1;
        int n = scanner.nextInt();
        int current = 0;
        int [] mag = new int[n];
        for(int i = 0; i < n; i++) {
            mag[i] = scanner.nextInt();
        }
        current = mag[0];
        for(int i = 1; i < n ; i++) {
            if(current != mag[i]) {
                numOfGroups++;
                current = mag[i];
            }
        }
        System.out.println(numOfGroups);
        scanner.close();
    }
}
