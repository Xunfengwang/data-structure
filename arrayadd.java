import java.util.Arrays;
public class arrayadd
{
    public static void main(String []args)
    {
        int [][]a={{3,8},{9,13}};
        int [][]b={{10,3},{-2,1}};
        int [][]c=new int[2][2];
        function(0,0,a,b,c);
        print(c);
    }
    public static int function(int i,int j,int[][]a,int[][]b,int [][]c)
    {
        if(i<0&&j<0)
        {
            return 1;
        }
        else if(i<=2&&j==0)
        {
            c[i][j]=a[i][j]+b[i][j];
            if(i+1!=2)
            {
                function(i+1,0,a,b,c);
            }
            else if(i+1==2)
            {
                function(i,1,a,b,c);
            }
            return c[i][j];
        }
        else if(j==1)
        {
            c[i][j]=a[i][j]+b[i][j];
            if(i-1>=0)
            {
                function(i-1,1,a,b,c);
            }
            return c[i][j];
        
        }
        return c[i][j];
    }
    public static void print(int [][]c)
    {
        for(int i=0;i<2;i++)
        {
            for(int k=0;k<2;k++)
            {
                System.out.print(c[i][k]+" ");
                if(k==1)
                {
                    System.out.println("");
                }
                
            }
        }
    }
}