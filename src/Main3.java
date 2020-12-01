import java.util.Scanner;

public class Main3 {
    static int judge(int x,int y){
        if (x > y){
            return 1;
        }else if(x < y){
            return 2;
        }else{
            return 3;
        }
    }
    static int compare1(int x, int y){
        return Math.max(x, y);
    }
    static boolean compare2(int x,int y) {
        return x >= y;
    }

    public static void main(String[] args) {
        int i, j, k = 0;
        Scanner sc = new Scanner(System.in);
        String str1 =sc.nextLine();
        char [] a = str1.toCharArray();
        String str2 = sc.nextLine();
        char[] b = str2.toCharArray();   //读入
        int[] c = new int[compare1(a.length,b.length)];
        int[] a1 = new int[compare1(a.length, b.length)];
        int[] b1 = new int[compare1(a.length, b.length)];
        int[] c1 = new int[compare1(a.length, b.length)];
        switch (judge(a.length, b.length)){
            case 1 :                                        //数a>数b
                for (i = 0;i < a.length-b.length; i++){
                    c[i] = 0;
                    k++;
                }
                for (i = 0;i < b.length; i++){
                    c[k] = b[i] - '0';
                    k++;
                }
                for (i = 0; i < c.length; i++){
                    a1[i] = a[i] - '0';
                }
                for (i = c1.length-1; i >= 0; i--) {
                    if (compare2(a1[i], c[i])) {
                        c1[i] = a1[i] - c[i];
                    } else {
                        c1[i] =  a1[i]+10-c[i];
                        a1[i - 1] -= 1;
                    }
                }
                for (int x : c1) {
                    System.out.printf("%d", x);
                }
                break;
            case 2 :                                       //数a<数b
                for (i = 0;i < b.length-a.length; i++){
                    c[i] = 0;
                    k++;
                }
                for (i = 0; i < a.length; i++) {
                    c[k] = a[i] - '0';
                    k++;
                }
                for (i = 0; i < c.length; i++){
                    b1[i] = b[i] - '0';
                }
                for (i = c1.length-1; i >= 0; i--) {
                    if (compare2(b1[i], c[i])) {
                        c1[i] = b1[i] - c[i];
                    } else {
                        c1[i] =  b1[i]+10-c[i];
                        b1[i - 1] -= 1;
                    }
                }
                System.out.print("-");
                for (int x:c1) {
                    System.out.printf("%d",x);
                }
                break;
            default :                                     //数a=数b
                for (i = 0; i < a.length; i++) {
                    a1[i] = a[i] - '0';
                    b1[i] = b[i] - '0';
                }
                for (i = 0; i < a1.length; i++){
                    if (a1[i] != b1[i]){
                        break;
                    }
                }
                j = i;
                if (compare2(a1[j], b1[j])){
                    for (i = a.length - 1; i >= 0; i--) {
                        if (compare2(a1[i], b1[i])) {
                            c1[i] = a1[i] - b1[i];
                        } else {
                            c1[i] = a1[i] + 10 - b1[i];
                            a1[i - 1] -= 1;
                        }
                    }
                    j = 0;
                        for (int x : c1){
                            System.out.printf("%d", x);
                        }
                }else{
                    for (i = a.length - 1; i >= 0; i--) {
                        if (compare2(a1[i],b1[i])) {
                            c1[i] = b1[i] + 10 - a1[i];
                            c1[i - 1] -= 1;
                        }else{
                            c1[i] = b1[i] - a1[i];
                        }
                    }
                    System.out.print("-");
                    for (int x : c1) {
                        System.out.printf("%d",x);
                    }
                }


                break;
        }
    }
}
