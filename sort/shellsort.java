import java.util.*;//shellsort的概念為將資料分割成固定等分，跳著比較，再將分割的間距縮短比較
public class shellsort
{
    public static void main(String[]args)
    {
        int []a={6,7,8,5,1,2,3,4};
        shellsort(a);
    }
    public static void shellsort(int []a)
    {   
        int gap=a.length/2;
        int idx;int temp;
        while(gap>=1)
        {
            for(int i=gap;i<a.length;i++)
            {
                idx=i;temp=a[i];
                if(temp<a[i-gap]&&idx>gap-1)
                {
                    a[i]=a[i-gap];
                    a[i-gap]=temp;
                }
                printarr(a);
            }
            gap=gap/2;
        }
    }
    public static void printarr(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}