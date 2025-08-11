package DayFour;
import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []students = new int[n];
        String []grades = new String[n];
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            grades[i] = scanner.nextLine();
        }
        for(int i = 0; i < m; i++) {
            int max = grades[0].charAt(i);
            for(int j = 1; j < n; j++) {
                if(max < grades[j].charAt(i)) {
                    max = grades[j].charAt(i);
                }
            }
            for(int j = 0; j < n; j++) {
                if(max == grades[j].charAt(i)) {
                    students[j] = 1;
                }
            }
        }
        for(int i = 1; i < n; i++) {
            students[0] += students[i];
        }
        System.out.println(students[0]);
        scanner.close();
    }
}
