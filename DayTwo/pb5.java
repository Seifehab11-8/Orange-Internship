package DayTwo;
import java.util.Scanner;
public class pb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int max1 = 0, max2 = 0;

        for(int i = 0; i < size; i++) {
            max1 |= scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            max2 |= scanner.nextInt();
        }

        System.out.println(max1+max2);
        scanner.close();
    }
}
