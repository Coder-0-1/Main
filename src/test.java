import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double a, b, result = 0;
        int c = 0, d = 0, e, f;
        int i, g;
        boolean h = true;
        a = kb.nextDouble();
        b = kb.nextDouble();
        while ( a>0 )
        {
            a = a/10;
            c++;
        }
        while ( b>0 )
        {
            b = b/10;
            d++;
        }
        if ( c>d )
        {
            for ( i=1;i<=c;i++ )
            {
                e = (int)a%10;
                f = (int)b%10;
                if ( e-f>0 )
                {
                    g = e-f;
                    a = a/10;
                    b = b/10;
                }else{
                    g = 10-f+e;
                    a = a/10-1;
                    b = b/10;
                }
                result = result*10+(double)g;
            }
        }else{
            for ( i=1;i<=d;i++ )
            {
                e = (int)a%10;
                f = (int)b%10;
                if ( f-e>0 )
                {
                    g = f-e;
                    a = a/10;
                    b = b/10;
                }else{
                    g = 10-e+f;
                    a = a/10;
                    b = b/10-1;
                }
                result = result*10+(double)g;
            }
            h = false;
        }
        if ( h )
        {
            System.out.printf("%f",result);
        }else{
            System.out.printf("%f",-result);
        }
    }
}
