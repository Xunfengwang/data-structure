import java.util.Arrays;
public class preinorder
{
    public static int c=0;
    public static void main(String [] args)
    {
        int [] predata =new int[]{5, 4, 2, 1, 3, 6, 8, 7, 9};
        int [] indata =new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        buildTree(predata,indata);
    }
    public static void buildTree(int predata[],int indata[])
    {
        if(indata.length==0) return ;
        int result;
        result=Arrays.binarySearch(indata,predata[0]);
        int [] left,right;
        if(result == -1 ) result = 0;
        left=getArray(indata,0,result);
        if(c==0)
        {
            right=getArray(predata,(result+1),(predata.length));
        }
        else
        {
            right=getArray(indata,(result+1),(indata.length));
        }
        c++;
        System.out.println("right");
        printArray(right);
        System.out.println("left");
        printArray(left);
        buildTree(getArray(predata,1,predata.length-1),left);
        buildTree(predata,right);
    }
    
    public static int[] getArray(int arr[],int start,int end)
    {
        int newarr[]=new int[end-start];
        int cu=0;
        for(int i=start;i<end;i++)
        {
            newarr[cu]=arr[i];
            cu++;
        }
        return newarr;

    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}