package DayFour;

import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arg = scanner.nextLine();
        int numOfTravel = 1;
        int counter = 1;
        char current = arg.charAt(0);
        for(int i = 1; i < arg.length(); i++) {
            if(current != arg.charAt(i)) {
                current = arg.charAt(i);
                counter = 0;
                numOfTravel++;
            }
            else if(counter == 5) {
                counter = 0;
                numOfTravel++;
            }
            counter++;
        }
        System.out.println(numOfTravel);
        scanner.close();
    }
}
