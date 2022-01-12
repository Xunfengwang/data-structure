public class matrixadd
{
    public static void main (String [] args)
    {
        int [][] matrix=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matrix1=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] ans=new int[3][3];
        int i=0;int j=0; int count1=0;
        cal(matrix,matrix1,ans,i,j,count1);
        print(ans);
    }
    public static void cal(int [][]matrix,int [][]matrix1,int [][]ans,int i,int j,int count1)
    {
        if(count1==3)
        {
            return;
        }
        else if(i<3&&count1<3)
        {
            if(j<3)
            {
                if(j+1==3)
                {
                    //System.out.println(i+" "+j+" 2");
                    ans[i][j]=matrix[i][j]+matrix1[i][j];
                    j=0;i=i+1;
                    //System.out.println(i+" "+j);
                    if(i<3)
                    {
                        cal(matrix,matrix1,ans,i,j,count1+1);
                    }
                    else
                    {
                        return;
                    }
                }
                else if(j+1!=3)
                {
                    //System.out.println(i+" "+j+" 3");
                    ans[i][j]=matrix[i][j]+matrix1[i][j];
                    cal(matrix,matrix1,ans,i,j+1,count1);
                }
            }
        }
    }
    public static void print(int [][]ans)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(ans[i][j]+" ");
                if(j==2)
                {System.out.println("");}
            }
        }
    }
}