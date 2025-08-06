import java.util.Scanner;

public class pb6 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int []boxPerCol;
        n = scanner.nextInt();
        boxPerCol = new int[n];
        for(int i = 0; i < n; i++) {
            boxPerCol[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n -i-1; j++) {
                if(boxPerCol[j] > boxPerCol[j+1]) {
                    int temp = boxPerCol[j];
                    boxPerCol[j] = boxPerCol[j+1];
                    boxPerCol[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(boxPerCol[i] + " ");
        }
        scanner.close();
    }
}
