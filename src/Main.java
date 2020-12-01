import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, c, d, e, f, result;
        String b;
        System.out.print("请输入入职年份\n");
        a = kb.nextInt();
        c = a % 100;
        if (c<=7)
        {
            if(c==2)
            { d = 3;}else {
                if (c % 2 == 1)
                {
                    d = 1;
                } else {
                    d = 2;
                }
            }
        }else{
            if(c%2==0)
            { d = 1;}else
            { d = 2;}
        }
        switch (d)
        {
            case 1:
                e = 31;
                /*System.out.print(e);*/
                break;
            case 2:
                e = 30;
                /*System.out.print(e);*/
                break;
            default:
                if ((a/100)%4==0&&(a/100)%100==0||(a/100)%400==0)
                {e = 29;}else{e = 28;}
                /*System.out.print(e);*/
                break;
        }
        f = a/100;
        b = kb.next();
        if (f%4==0&&f%100==0||f%400==0)
        {
            if ("男".equals(b))
            {
                result = e*2000+2500;
            }else{
                result = e*2000+5000;
            }
        }else{
                if(c%2==0)
                {
                    result = e*1000+2000;
                }else{
                    result = e*1000+1000;
                }
        }
        System.out.printf("%d, %s, %d\n",a,b,result);
        kb.close();
    }
}