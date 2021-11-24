import static java.lang.System.out;
import java.util.Scanner;
public class quicksort
{
    static Scanner key= new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println("Input the length:");
        int len=key.nextInt();
        int [] a =new int [len];
        insertarr(a);
        printarr(a);
        qsort(a,0,a.length-1);
    }
    public static void insertarr(int [] a)
    {
        int i=0;
        while(i<a.length)
        {
            System.out.print("a["+i+"]:");
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
    public static void qsort(int [] a,int low,int high)
    {
        int temp,i,j,p;
        if(low>=high)
        {
            return;
        }
        i=low;
        j=high;
        p=a[low];
        
        while(i<j)
        {
            //找比p小的直，從右
            while(a[j]>=p&&i<j)
            {
                j--;
            }
            //找比p大的值，從左
            while(a[i]<=p&&i<j)
            {
                i++;
            }
            //找到後交換
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            printarr(a);
            System.out.println(i+","+j);
        }
        a[low]=a[i];//指標相遇，交換
        a[i]=p;
        qsort(a,low,j-1);//左邊排序
        qsort(a,i+1,high);//右邊排序
    }

}