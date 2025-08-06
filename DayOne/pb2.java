package DayOne;
import java.util.Scanner;

public class pb2 {
    public static String AntonAndDanik(int n, String games){
        int antonCounter = 0, danikCounter = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            if(games.charAt(i) == 'A') {
                antonCounter++;
            }
            else {
                danikCounter++;
            }
        }
        if(antonCounter > danikCounter) {
            result = "Anton";
        }
        else if(antonCounter < danikCounter) {
            result = "Danik";
        }
        else {
            result = "Friendship";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        scanner.nextInt();
        n = scanner.nextInt();
        String str = scanner.nextLine();

        String result = AntonAndDanik(n, str);
        System.out.println(result);

        scanner.close();
    }
}
