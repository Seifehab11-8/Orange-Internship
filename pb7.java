import java.util.Scanner;

public class pb7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        String present1 = scanner.nextLine().toLowerCase();
        String present2 = scanner.nextLine().toLowerCase();
        for(int i = 0; i < present2.length(); i++) {
            if(present1.charAt(i) > present2.charAt(i)) {
                result = 1;
                break;
            }
            else if(present1.charAt(i) < present2.charAt(i)) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
