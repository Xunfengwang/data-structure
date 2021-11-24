import static java.lang.System.out;
import java.util.Scanner;
public class bubblesort
{
    static Scanner key=new Scanner(System.in);
    public static void main (String [] args)
    {
        System.out.println("Input the length");
        int len=key.nextInt();
        int [] a = new int [len];
        insertarr(a);
        printarr(a);
        bubbsort(a);
    }
    public static void insertarr(int [] a)
    {
        int i=0;
        while(i<a.length)
        {
            System.out.println("a["+i+"]:");
            a[i]=key.nextInt();
            i++;
        }
    }
    public static void printarr(int [] a)
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
    public static void bubbsort(int [] a)
    {
        int e=0;int i=0;int temp=0;
        while(e<a.length)
        {
            i=0;
            while(i<a.length-1)
            {
                if(a[i]>a[i+1])
                {
                    //System.out.println(a[i]+","+a[i+1]);
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    i++;
                }
                else
                {
                    i++;
                }
            }
            printarr(a);
            e++;
        }
        printarr(a);
    }
}