package DayOne;
import java.util.Scanner;

public class pb9 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppCaseCount = 0, lowCaseCount = 0;
        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                uppCaseCount++;
            }
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                lowCaseCount++;
            }
        }
        if(uppCaseCount <= lowCaseCount) {
            word = word.toLowerCase();
        }
        else {
            word = word.toUpperCase();
        }
        System.out.println(word);
        scanner.close();
    }
}
