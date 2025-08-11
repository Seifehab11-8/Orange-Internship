package DayTwo;

import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answerFound = false;
        int k = scanner.nextInt(), d = scanner.nextInt();
        long dr = 0;
        char count = '0';
        int intialUpdateIndex = 0;
        if(k == 1) {
            System.out.println(d);
            scanner.close();
            return;
        }
        StringBuilder n = new StringBuilder('1' +
                "0".repeat(Math.max(0, k - 1)));
        String max = "9".repeat(Math.max(0, k));
        while (!n.toString().equals(max)){
            long temp = 0;
            for(int i = 0; i < n.length(); i++) {
                dr += (n.charAt(i) - '0');
            }
            while(dr > 10){
                temp = dr;
                dr = 0;
                while(temp != 0){
                    dr += (temp % 10);
                    temp/=(10);
                }
                temp = dr;
            }

            if(dr == d) {
                answerFound = true;
                break;
            }
            if(count == '9'){
                count ='0';
                intialUpdateIndex++;
            }
            dr = 0;
            ++count;
            n.setCharAt(n.length()-intialUpdateIndex-1, count);
        }
        if(answerFound) {
            System.out.println(n);
        }
        else {
            System.out.println("No solution");
        }
        scanner.close();
    }
}
