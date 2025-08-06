import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class pb1 {
    public static int VanyaAndFence(int n, int h, int[] arr){
        int result = n;
        for (int i = 0; i < n; i++) {
            if(arr[i] > h) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, h = 0;
        int [] arr;
        n = scanner.nextInt();
        h = scanner.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = VanyaAndFence(n, h, arr);
        System.out.println(result);
        scanner.close();
    }
}