
class Father {
    public String name;
    public int age;
    private int addAge = 3;

    public int calc() {
        return this.age + addAge;
    }
}

class Test1 extends Father {
    public Test1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("run....");
    }

    void call()// 橫向找，遇到1往下找
    {
        int ans = this.calc();
        System.out.println(ans);
    }
}

class Test2 extends Father {
}


//主class
public class example {
    public static void main(String[] args) {
        Test1 bbb1 = new Test1("sam", 25);
        bbb1.call();
    }
}
