import java.util.*;
public class heapsort
{
    static int[]a={18, 62, 41, 72, 6, 31, 52};
    static Scanner key=new Scanner(System.in);
    public static void main (String [] args)
    {
                int i=0;
                i=a.length;
                buildheap(a,i);
    }
    public static void buildheap(int []a,int i)
    {
        for(int k=i/2-1;k>=0;k--)
        {
            maxheap(a,i,k);
        }
    }
    public static void maxheap(int [] a,int i,int k)
    {
        int temp,large;
        temp=a[k];
        while(k*2+1<i)
        {
            large=2*k+1;
            if((large+1<i)&&a[large]<a[large+1])
            {
                large=large+1;
            }
            if(temp>=a[large])
            {
                break;
            }
            a[k]=a[large];
            k=large;
        }
        a[k]=temp;
        print(a);
    }
    public static void print(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
}