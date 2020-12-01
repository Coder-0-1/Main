import java.util.*;
import java.util.Collections;
import java.util.Comparator;
public class test3 {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        int tmp;
        int k;
        Scanner kb = new Scanner(System.in);
        String kb1 = kb.nextLine();
        Scanner kb2 = new Scanner(kb1);
        while (kb2.hasNextLine()){
            c.add(kb2.nextInt());
        }
        String kb3 = kb.nextLine();
        Scanner kb4 = new Scanner(kb3);
        while (kb4.hasNextLine()){
            c.add(kb4.nextInt());
        }        //输入两组整数
        c = new ArrayList<>(new HashSet<>(c));  //排重
        Collections.sort(c,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = o1-o2;
                if (a>0){
                    return -1;
                }else if (a < 0) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });         //排序：降序
        for (k=0;k<c.size();k++) {
            tmp = c.get(k);
            System.out.println(tmp+" ");
        }        //输出结果
    }
}
