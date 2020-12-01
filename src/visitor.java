public class visitor {
    String name;
    int age;
    static String money(int age) {
        String a;
        if (age >= 12){
            a = "20";
        }else{
            a = "门票免费";
        }
        return a;
    }

    public static void main(String[] args) {
        visitor Visitor = new visitor();
        Visitor.name = "张三";
        Visitor.age = 13;
        System.out.println(Visitor.name+"的年龄为:"+Visitor.age+","+"门票的价格为:"+money(Visitor.age));
    }
}
