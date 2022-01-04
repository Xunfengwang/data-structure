

// interface HaveCall{
//     public void Call();
// }
class Father {
    public String name;
    public int age;
    private int addAge = 3;

    // 加上 final 就不能覆寫
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

    // 覆寫父類別的方法
    @Override
    public int calc(){
        return 3;
    }
    
    void call()
    {
        int ans = this.calc();
        System.out.println(ans);
    }
}

class Test2 extends Father {
}

class Test3 {
    public static int Right = 1;
    public int Left = 1;

    public Test3() {
        System.out.println("run test3");
        Right++;
        Left++;
    }

}

// 主class
public class example {

    public static String DisplayName = "test";

    public static void ShowName() {
        System.out.println(DisplayName);
    }

    public static void main(String[] args) {
        Test1 bbb1 = new Test1("sam", 25);
        bbb1.call();

        ShowName();
        System.out.println("-------------");

        Test3 test3 = new Test3();
        System.out.println("Right: "+test3.Right);
        System.out.println("Left: "+test3.Left);
        System.out.println("-------------");
        Test3 test2 = new Test3();
        System.out.println("Right: "+test2.Right);
        System.out.println("Left: "+test2.Left);

        System.out.println(Test3.Right); //Test3.Left不能使用
    }
}
