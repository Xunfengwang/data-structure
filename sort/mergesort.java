import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class mergesort
{
    static Scanner key=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Input the length:");
        int len = key.nextInt();
        int [] a =new int [len];
        insertarr(a);
        printarr(a);
        devide(a);
    }
    public static void insertarr(int[]a)
    {
        int i=0;
        while(i<a.length)
        {
            System.out.println("input:"+"a["+i+"]");
            a[i]=key.nextInt();
            i++;
        }
    }
    public static void printarr(int[]a)
    {
        int i=0;
        while(i<a.length)
        {
            if(i==a.length-1)
            {
                System.out.println(a[i]);
                i++;
            }
            else
            {
                System.out.print(a[i]+",");
                i++;
            }
        }
    }
    public static void devide(int[] a)//其實這裡是拆開在合併回去
    {
        int result=a.length/2;
        int start=0;int end=1;int mid=result;
        int left[]= new int [result];
        int right[] = new int [a.length-result];
        int i=0;
        while(i<left.length)
        {
            left[i]=a[i];
            i++;
        }
        sort(left);
        i=0;
        while(i<right.length)
        {
            right[i]=a[mid];
            i++;
            mid++;
        }
        sort(right);
        int [] combin= new int [left.length+right.length];
        combin=merge(left,right);
        printarr(combin);
        
    }
    public static int[] sort(int [] array)
    {
        int i=0;
        int temp=0;
        int []newarr=new int [array.length];
        while(i<array.length-1)
        {
            if(array[i]>array[i+1])
            {
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                newarr[i]=array[i];
                newarr[i+1]=array[i+1];
                i++;
            }
            else
            {
                newarr[i]=array[i];
                newarr[i+1]=array[i+1];
                i++;
            }
        }
        return newarr;   
    }
    public static int[] merge(int[] number1, int[] number2) //這裡為參考別人的
    {
        int[] number3 = new int[number1.length + number2.length];
        
        int i = 0, j = 0, k = 0; 
        while(i < number1.length && j < number2.length) 
        { 
            if(number1[i] <= number2[j]) 
            {
                number3[k] = number1[i]; 
                k++;i++;
            }
            else 
            {
                number3[k] = number2[j];
                 k++;j++;
            }
        } 

        while(i < number1.length) 
            number3[k++] = number1[i++];
        while(j < number2.length) 
            number3[k++] = number2[j++];
        return number3;
    }
}