# Java Data Struckure
1.練習用  
2.good  


使用範例:
```java
    class Father {
    public String name;
    public int age;
    private int addAge = 3;

    // 加上 final 就不能覆寫
    public int calc() {
        return this.age + addAge;
    }
}
```