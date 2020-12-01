import java.util.Scanner;

public class MyMath {
    public static int max(int a, int b, int c) {
        int max;
        if (a < b) {
            max = Math.max(b, c);
        } else {
            max = Math.max(a, c);
        }
        return max;
    }

    public static int min(int a, int b, int c) {
        int min;
        if (a > b) {
            min = Math.min(b, c);
        } else {
            min = Math.min(a, c);
        }
        return min;
    }

    public static int sum(int a, int b, int c) {
        int sum;
        sum = a + b + c;
        return sum;
    }

    public static float ave(int a, int b, int c) {
        float ave;
        ave = (float) (a + b + c) / 3;
        return ave;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("最大的数字为" + max(a, b, c));
        System.out.println("最小的数字为" + min(a, b, c));
        System.out.println("三个数的和为" + sum(a, b, c));
        System.out.println("三个数的平均值为" + ave(a, b, c));
    }
}
