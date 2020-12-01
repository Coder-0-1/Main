import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() + 1;
        int[][] triangle = new int[num][];
        j = (num - 1) * 2;
        for (int x = 0; x < triangle.length; x++) {
            for (i = 0; i <= j - x * 2 - 1; i++) {
                System.out.print(" ");
            }
            triangle[x] = new int[x + 1];
            for (int y = 0; y <= x; y++) {
                if (x == 0 || y == 0 || y == x) {
                    triangle[x][y] = 1;
                } else {
                    triangle[x][y] = triangle[x - 1][y] + triangle[x - 1][y - 1];
                }
                if (triangle[x][y] >= 0 && triangle[x][y] <= 9) {
                    System.out.print(" " + " " + " " + triangle[x][y]);
                } else if (triangle[x][y] >= 10 && triangle[x][y] <= 99) {
                    System.out.print(" " + " " + triangle[x][y]);
                } else if (triangle[x][y] >= 100 && triangle[x][y] <= 999) {
                    System.out.print(" " + triangle[x][y]);
                }
            }
            System.out.print("\n");
        }
    }
}
