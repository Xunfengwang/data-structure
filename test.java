public class test
{
    /*public static void main(String []args)
    {
        int k=10;
        System.out.println(function(k));
        int c=0;
        int a=3,b=5,d=8;
        int o,f;
        f=(b--*d);
        System.out.println(b);
        a=3;b=5;d=8;
        o=a+b*++d;
        System.out.println(f+" "+o);
        for(int j=1, l=2;j<3*l&&l!=4;k--,l++)
        {
            j++;
            c++;
            System.out.println(j);
        }
        System.out.println(c);
    }
    public static int function(int k)
    {
        if(k==0)
        {
            return 1;
        }
        else
        {
            return 2*function(k-1);
        }
    }*/
    public static void main(String [] args)//3POWER N * 5 POWER N 
    {
        int n=2,ans;
        ans=function(n,3,5,1,1); 
        System.out.println(ans);
    }
    public static int function(int n,int a,int b,int c,int d)
    {
        if(n==0)
        {
            return c*d;
        }
        else
        {
            return function(n-1,a,b,c*a,d*b);
        }
    }
}