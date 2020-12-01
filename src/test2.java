import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, b;
        String c;
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.next();
        switch (c)
        {
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            default:
                if ( a%b==0 )
                {
                    System.out.println(a/b);
                    break;
                }else {
                    System.out.printf("%.2f", (double) a / b);
                    break;
                }
        }
    }
}
