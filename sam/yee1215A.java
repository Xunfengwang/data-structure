package sam;

import java.lang.System;

public class yee1215A {

    public static void main(String[] args) {
        int[][] input = { { 3, 8 }, { 9, 13 } };
        var result = recursive(1, 1, input);
        System.out.println(Math.abs(result));
    }

    public static int recursive(int i, int j, int[][] arr) {
        if (i < 0 || j < 0) return 1;
        int a = 0;
        int b = 0;

        if (i == 1 && j == 1) {
            a = arr[i][j] * recursive(i - 1, j - 1, arr);
            b = arr[i - 1][j] * recursive(i, j - 1, arr);
        } else {
            return arr[i][j];
        }

        return a - b;
    }
}
