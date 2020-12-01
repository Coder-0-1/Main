import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[1000];
        int i = 0;
        do {
            array[i] = sc.nextInt();
            i++;
        } while (array[i - 1] != 0);
        int max = array[0];
        int min = array[0];
        for (int k = 1; k < i - 1; k++) {
            if (array[k] > max) {
                max = array[k];
            }
            if (array[k] < min) {
                min = array[k];
            }
        }
        System.out.println("max:" + max + " " + "min:" + min);
    }
}
