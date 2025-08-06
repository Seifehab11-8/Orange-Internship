import java.util.Scanner;

public class pb3 {
    public static int BearAndBigBrother(int a, int b){
        int years = 0;
        while(a <= b) {
            years++;
            a*=3;
            b*=2;
        }
        return years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();

        int result = BearAndBigBrother(a, b);
        System.out.println(result);
        scanner.close();
    }
}
