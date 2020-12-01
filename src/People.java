public class People {
    String name;
    int age;

    public void setName(String Name) {
        name = Name;
    }

    public void getName() {
        System.out.println("姓名是:" + name);
    }

    public void setAge(int Age) {
        age = Age;
    }

    public void getAge() {
        System.out.println("年龄是:" + age);
    }

    public static void main(String[] args) {
        People people = new People();
        people.setName("无名氏");
        people.setAge(20);
        people.getName();
        people.getAge();
    }
}
