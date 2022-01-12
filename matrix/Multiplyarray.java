import java.util.Arrays;
public class Multiplyarray
{
    public static void main(String []args)
    {
        int [][]a={{3,8},{9,13}};
        int result=function(1,1,a);
        System.out.println(Math.abs(result));
    }
    public static int function(int i,int j,int[][]a)
    {
        int b=0;int c=0;
        if(i<0&&j<0)
        {
            return 1;
        }
        if(i==1&&j==1)
        {
            b=a[i][j]*(function(i-1,j-1,a));
            c=a[i-1][j]*(function(i,j-1,a));
        }
        else
        {
            return a[i][j];
        }
        return b-c;

    }
}