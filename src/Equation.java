import java.util.Scanner;

public class Equation {
    float A, B, C;
    int rootType;
    float root1, root2;

    public Equation(float a, float b, float c) {
        A = a;
        B = b;
        C = c;
    }

    public void Solving() {
        if ((Math.pow(B, 2) - (4 * A * C)) > 0) {
            root1 = (float) ((-B) + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
            root2 = (float) ((-B) - Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
            rootType = 2;
        } else if ((Math.pow(B, 2) - (4 * A * C)) == 0) {
            root1 = (float) (B + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
            root2 = root1;
            rootType = 1;
        } else {
            rootType = 0;
        }
    }

    public void print() {
        System.out.println("方程的二次方系数为" + A + "一次方系数为" + B + "常数为" + C);
        switch (rootType) {
            case 0:
                System.out.println("该方程无实根");
                break;
            case 1:
                System.out.println("该方程有两个相等实根为" + root1);
                break;
            default:
                System.out.println("该方程有两个实根，分别为" + root1 + "," + root2);
                break;
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Equation equation;
        equation = new Equation(a, b, c);
        equation.Solving();
        equation.print();
    }
}
