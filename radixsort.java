import java.util.*;
public class radixsort
{
    public static void main(String [] args)
    {
        int []arr={73,22, 93, 43, 55, 14, 28, 65, 39, 81};
        int [][]sorting=new int[10][arr.length];
        radix(arr,sorting);
    }

    public static void printarr(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void print(int [][]sorting)
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(sorting[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
    }
    public static void radix(int []arr,int [][] sorting)
    {
        int []order=new int[arr.length];
        int x=0;
        int n=1;
        while(n<100)
        {
            for(int i=0;i<arr.length;i++)
            {
                int mod=(arr[i]/n)%10;//n為1時從個位數排序，接著是10位，100位
                System.out.println(mod);
                sorting[mod][order[mod]]=arr[i];//將資料放入sorting的矩陣
                order[mod]++;//紀錄各個餘數例如1,2,3.....所累積的數量
            }
            print(sorting);
            for(int k=0;k<arr.length;k++)
            {
                if(order[k]!=0)//如果計數器不為0代表有資料
                {
                    for(int j=0;j<order[k];j++)
                    {
                        arr[x]=sorting[k][j];//從0開始，如果有資料就放回arr陣列中
                        x++;
                    }
                }
                order[k]=0;//排完了就清空order的紀錄數值
            }
            n=n*10;
            x=0;
            printarr(arr);
            
        }
    }
}