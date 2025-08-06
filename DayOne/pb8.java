package DayOne;
import java.util.Scanner;

public class pb8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "CHAT WITH HER!";
        String username = scanner.nextLine();
        int []counter = new int[256];
        for(int i = 0; i < username.length(); i++) {
            counter[username.charAt(i)]++;
        }
        int acc = 0;
        for(int i = 0; i < 256; i++) {
            if(counter[i] != 0)
                acc++;
        }
        if(acc % 2 == 1) {
            result = "IGNORE HIM!";
        }
        System.out.println(result);
        scanner.close();
    }
}
