import static java.lang.System.out;
import java.util.Scanner;
public class insertsort
{
    static Scanner key=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println("input the length:");
        int len=key.nextInt();
        int [] a = new int [len];
        insertarr(a);
        printarr(a);
        sortarr(a);
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
    public static void sortarr(int[]a)
    {
        int i=1;
        int temp=0;
        int k=i;
        while(i<a.length)
        {
            k=i;
            while(k>0)
            {
                //System.out.println(i);
                if(a[k]<a[k-1])
                {
                    temp=a[k-1];
                    a[k-1]=a[k];
                    a[k]=temp;
                    System.out.println(a[k]+","+a[k-1]+" "+"SWAP");
                    k--;
                }
                else
                {
                    k--;
                }
            }
            i++;
            printarr(a);
        }
        printarr(a);
    }
}