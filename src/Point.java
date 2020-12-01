import java.util.Scanner;

public class Point {
    String x;
    String y;
    public Point(String a, String b) {
        x = a;
        y = b;
    }
    public void print(){
        System.out.println("坐标是"+"("+x+","+y+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        String coordinate;
        System.out.println("输入格式为* + , + * + 空格");
        coordinate = sc.nextLine();
        a = coordinate.substring(0,coordinate.indexOf(","));
        b = coordinate.substring(coordinate.indexOf(",")+1,coordinate.indexOf(" "));
        Point point;
        point = new Point(a,b);
        point.print();
    }
}
