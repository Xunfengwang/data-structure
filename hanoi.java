//update
import java.util.Scanner;
public class hanoi
{
    static Scanner key=new Scanner(System.in);
    static int count=0;
    public static void main(String []args)
    {
        System.out.println("input the num of plate:");
        int num=key.nextInt();
       // int count=0;
        function('a','b','c',num);
    }
    public static void function(char from,char pass,char to,int num)
    {
        if(num==0)
        {
            return;
        }
        
            function(from,to,pass,num-1);
            count++;
            System.out.println(count+" "+num+" move from "+from+" to "+ to);
            function(pass,from,to,num-1);
    
    }
}