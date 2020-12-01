import java.util.Scanner;

public class Main2 {
    static int statistics(int[] x) {
        int k = 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) {
                k += 2;
            }
        }
        return k;
    }

    static boolean judge(int x, int[] y) {
        boolean flag = false;
        for (int j : y) {
            if (x == j) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a = new int[40];
        Scanner kb = new Scanner(System.in);
        String kb1 = kb.nextLine();
        Scanner kb2 = new Scanner(kb1);
        int i, j, k = 0;
        for (i = 0; i < a.length; i++) {
            a[i] = kb2.nextInt();
            k++;
            if (!kb2.hasNext()) {
                break;
            }
        }
        String kb3 = kb.nextLine();
        Scanner kb4 = new Scanner(kb3);
        for (j = i + 1; j < a.length; j++) {
            a[j] = kb4.nextInt();
            k++;
            if (!kb4.hasNext()) {
                break;
            }
        }      //两组整数读入
        int[] b = new int[k];
        for (i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        int tmp;
        for (i = 1; i < b.length; i++) {
            boolean flag = true;
            for (j = 0; j < b.length - i; j++) {
                if (b[j] < b[j + 1]) {
                    tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }     //降序
        int[] rub = new int[statistics(b)];
        j = 0;
        for (i = 0; i < b.length - 1; i++) {
            if (b[i] == b[i + 1]) {
                rub[j] = i;
                rub[j + 1] = i + 1;
                j += 2;
            }
        }

        int[] c = new int[b.length - rub.length];
        k = 0;
        //System.out.println(c.length);
        for (i = 0; i < b.length; i++) {
            if (!judge(i, rub)) {
                c[k] = b[i];
                k++;
            }
        }
        /*for (int x:b){
            System.out.printf("%d ",x);
        }
        System.out.print("\n");
        for (int x:rub){
            System.out.printf("%d ",x);
        }    //输出
        System.out.print("\n");*/
        for (int x : c) {
            System.out.printf("%d ", x);
        }
    }
}
