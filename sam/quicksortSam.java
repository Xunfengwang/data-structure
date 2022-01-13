// package sam;

import java.util.Scanner;
import java.util.Arrays;

class quickObj {
    // input的資料
    private int[] list;

    public quickObj(int[] input) {
        this.list = input.clone();
        this.processList(0, this.list.length - 1);
    }

    private void processList(int left, int right) {
        int leftIndex = left;
        int rightIndex = right + 1;

        if (left < right) {
            while (true) {
                leftIndex++;
                while ((leftIndex + 1) < this.list.length && this.list[leftIndex] < this.list[left]) {
                    leftIndex++;
                }

                rightIndex--;
                while ((rightIndex - 1) >= 0 && this.list[rightIndex] > this.list[left]) {
                    rightIndex--;
                }

                if (leftIndex >= rightIndex)
                    break;
                swap(leftIndex, rightIndex);
            }
            swap(left, rightIndex);
            this.processList(left, rightIndex - 1);
            this.processList(rightIndex + 1, right);
        }
    }

    // 交換位置
    private void swap(int i, int j) {
        int temp = this.list[i];
        this.list[i] = this.list[j];
        this.list[j] = temp;
    }
    

    // 陣列轉字串
    public String outptuStrArray() {
        return Arrays.toString(this.list);
    }
}

public class quicksortSam {
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the length:");
        int len = key.nextInt();
        int[] input = new int[len];
        insertArr(input);

        quickObj obj = new quickObj(input);
        System.out.println(obj.outptuStrArray());
    }

    public static void insertArr(int[] a) {
        int i = 0;
        while (i < a.length) {
            System.out.print("a[" + i + "]:");
            a[i] = key.nextInt();
            i++;
        }
    }
}
