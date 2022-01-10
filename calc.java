public class calc {
    public static void main(String[] args) {
        int ans = calc(3, 3 * 5);
        System.out.println(ans);
    }

    public static int calc(int n, int input) {
        if (n <= 1) {
            return 1 * input;
        } 
        return calc(n - 1, input) * calc(n - 2, input);

    }
}
