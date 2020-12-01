import java.util.Scanner;

public class checkLuckyNumber {
    int[] lm = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

    public boolean way1(int num) {
        boolean flag = false;
        for (int i : lm) {
            if (num == i) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean way2(int num) {
        boolean flag = false;
        for (int j : lm) {
            if (num % j == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkLuckyNumber ln = new checkLuckyNumber();
        int num = sc.nextInt();
        if (ln.way1(num) || ln.way2(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
