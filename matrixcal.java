public class matrixcal
{
    public static void main (String [] args)
    {
        int [][] matrix=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int num=matrix.length;
        int count=1;
        int i=0;int j=0;int ans=1;
        cal(matrix,i,j,num,count,ans);
    }
    public static void cal(int[][]matrix,int i,int j,int num,int c,int ans)
    {
        if(j==2)
        {
            return;
        }
        else
        {
            if(j%2!=0)
            {
                ans=ans-(matrix[i][j]*(matrix[j][i]));
            }
            else if(j%2==0)
            {
                ans=ans*();
            }
        }
    }
}