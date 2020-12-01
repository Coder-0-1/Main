import java.util.Scanner;
public class Main4 {
    static int compare1(int x, int y){
        return Math.max(x, y);
    }
    static int judge(int x,int y){
        if (x > y){
            return 1;
        }else if(x < y){
            return 2;
        }else{
            return 3;
        }
    }                                   //方法用于判断输入两个整数的位数
    static int num(int[] x){
        int k = 0;
        for (int m:x){
            if (m != 0){
                break;
            }
            k++;
        }
        return k;
    }
    public static void main(String[] args) {
        int i, k = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine();
        char [] a = str1.toCharArray();
        String str2 = sc.nextLine();
        char[] b = str2.toCharArray();   //读入
        char[] a1 = new char[compare1(a.length,b.length)];
        char[] b1 = new char[compare1(a.length, b.length)];
        int[] a2 = new int[compare1(a.length, b.length)];
        int[] b2 = new int[compare1(a.length, b.length)];
        switch (judge(a.length, b.length)){
            case 1:
                for (i = 0; i < a1.length - b.length; i++) {
                    b1[i] = '0';
                    k++;
                }
                for (i = 0;i < b.length; i++){
                    b1[k] = b[i];
                    k++;
                }
                for (i = 0; i < a1.length; i++) {
                    a2[i] = a[i] - '0';
                    b2[i] = b1[i] - '0';
                }
                break;
            case 2 :
                for (i = 0; i < b1.length - a.length; i++) {
                    a1[i] = '0';
                    k++;
                }
                for (i = 0;i < a.length; i++){
                    a1[k] = a[i];
                    k++;
                }
                for (i = 0; i < b1.length; i++) {
                    a2[i] = a1[i] - '0';
                    b2[i] = b[i] - '0';
                }
                break;
            default:
                for (i = 0; i < a.length; i++) {
                    a2[i] = a[i] - '0';
                    b2[i] = b[i] - '0';
                }
        }                                //转换为int型
        for (i = 0;i<a2.length;i++){
            if(a2[i] != b2[i]){
                break;
            }
            j++;
        }                                //确定前几位数相同
        if (j == a.length){
            System.out.print("0");
        }else {
            int[] d = new int[a2.length - j];
            if (a2[j] > b2[j]) {
                for (i = a1.length - 1; i >= 0; i--) {
                    if (a2[i] - b2[i] > 0) {
                        d[i - j] = a2[i] - b2[i];
                    } else if (a2[i] - b2[i] < 0) {
                        d[i - j] = a2[i] + 10 - b2[i];
                        a2[i - 1] -= 1;
                    }
                }
                for (i = num(d); i < d.length; i++) {
                    System.out.printf("%d", d[i]);
                }
            } else if (a2[j] < b2[j]) {
                for (i = a1.length - 1; i >= 0; i--) {
                    if (b2[i] - a2[i] > 0) {
                        d[i - j] = b2[i] - a2[i];
                    } else if (b2[i] - a2[i] < 0) {
                        d[i - j] = b2[i] + 10 - a2[i];
                        b2[i - 1] -= 1;
                    }
                }
                System.out.print("-");
                for (i = num(d); i < d.length; i++) {
                    System.out.printf("%d", d[i]);
                }
            }
        }                                       //计算并输出



        /*System.out.println(i);
        for (int x:a2){
            System.out.printf("%d",x);
        }
        System.out.print("\n");
        for (int x:b2){
            System.out.printf("%d",x);
        }*/
    }
}
