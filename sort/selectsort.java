import static java.lang.System.out;
import java.util.Scanner;
public class selectsort
{
    static Scanner key=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Input the length:");
        int len=key.nextInt();
        int[]a=new int[len];
        insertarr(a);
        printarr(a);
        selectsort(a);
    }
    public static void insertarr(int []a)
    {
        int i=0;
        while(i<a.length)
        {
            System.out.println("input:"+"a"+"["+i+"]");
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
                System.out.print(a[i]);
                i++;
            }
            else
            {
                System.out.print(a[i]+",");
                i++;
            }
            
        }
        System.out.println("");
    }
    public static void selectsort(int[]a)
    {
        int i=0;
        int k=a.length-1;
        int position,temp,currentmin,currentminpot,min;
        position=0;min=0;
        currentminpot=i;//一開始min位置設為[0]
        currentmin=a[i];//一開始min值為a[0]
        while(i<a.length)
        {
            position=k;min=a[k];
            //做交換
            while(k>i)
            {
                //先找到當前最小的
                if(min>a[k])
                {
                    min=a[k];
                    position=k;
                    k--;
                }
                else
                {
                    k--;
                }
            }
            if(min<a[i])
            {
                a[position]=a[i];
                a[i]=min;
                i++;
            }
            else
            {
                i++;
            }
            printarr(a);
            k=a.length-1;
        }
        
    }
}