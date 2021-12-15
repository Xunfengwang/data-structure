public class test
{
    public static void main(String []args)
    {
        int k=10;
        System.out.println(function(k));
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
    }
}