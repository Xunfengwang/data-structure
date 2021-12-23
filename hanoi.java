import java.util.Scanner;
public class hanoi
{
    static Scanner key=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.println("input the num of plate:");
        int num=key.nextInt();
        int count=0;
        function(1,2,3,num,count);
    }
    public static void function(int a,int b,int c,int num,int count)
    {
        if(num==1)
        {
            System.out.println(num+" plate move from "+a+" to "+c);
            count++;
        }
        else
        {
            function(1,3,2,num-1,count);
            function(1,2,3,1,count);
            function(2,1,3,num-1,count);
            
        }
    }
}