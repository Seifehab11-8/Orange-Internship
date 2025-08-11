package DayFour;

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []blocks = new int[n];
        int []blockCoverage = new int[n];
        for(int i = 0; i < n; i++) {
            if(scanner.hasNextInt())
                blocks[i] = scanner.nextInt();
        }
        

        for(int i = 0; i < n; i++) {
            int l = i, r = i;
            while(r < n-1) {
                if(blocks[r] >= blocks[r+1])
                    blockCoverage[i]++;
                else break;
                r++;
            }
            while(l > 0) {
                if(blocks[l] >= blocks[l-1])
                    blockCoverage[i]++;
                else break;
                l--;
            }
        }
        int max = blockCoverage[0];
        for(int i = 1; i < n; i++) {
            if(max < blockCoverage[i]) max = blockCoverage[i];
        }
        System.out.println(max+1);
        scanner.close();
    }
}
