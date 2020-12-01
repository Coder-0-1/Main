import java.util.Scanner;

public class Money {
    String yuan;
    String jiao;
    String fen;
    public  Money(String a,String b,String c){
        yuan = a;
        jiao = b;
        fen = c;
    }
    public void show(){
        System.out.println(yuan+"元"+jiao+"角"+fen+"分");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = sc.nextLine();
        String a, b, c;
        a = get.substring(0,get.indexOf("."));
        b = get.substring(get.indexOf(".")+1,get.indexOf(".")+2);
        c = get.substring(get.indexOf(".")+2);
        Money money;
        money = new Money(a,b,c);
        money.show();
    }
}
