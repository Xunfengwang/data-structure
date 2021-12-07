import static java.lang.System.out;
import java.util.Scanner;
//多項式相乘
class node {
	public int coef;
	public int exp;
	public node link;
}
public class polyfix {
	static Scanner key = new Scanner(System.in);
	public static node current, prev, next, ptr, head, tmp, head1, current1, head2, current2,tail,tail1,tail2;
    public static int c=0;
    public static int c1=0;
	public static void main(String[] args) 
    { 
        head=new node(); tail=new node(); head.link=tail; tail.link=null;
	    head1=new node();tail1=new node();head1.link=tail1; tail1.link=null;
        head2=new node();tail2=new node();head2.link=tail2; tail2.link=null;
        while(true)
        {
            System.out.println("1 for insert list one end,2 for insert list two end,3 show,4 show2,5 combine");
            int num=key.nextInt();
            if(num==1)
            {
                listinsert(head,1,tail);
                c++;
            }
            else if(num==2)
            {
                listinsert(head1,2,tail1);
                c1++;
            }
            else if(num==3)
            {
                showlist(head,1,tail);
                showlist(head1,2,tail1);
            }
            else if(num==5)
            {
                combin(head,head1,head2,tail,tail1,tail2);
            }
            else
            {
                System.exit(0);
            }
        }
    }
    public static void listinsert(node innode,int a,node end)
    {

        while(a>0)
        {
            if(a==1)
            {
                current=head;
                end=tail;
                a=a-10;
            }
            else
            {
                current=head1;
                end=tail1;
                a=a-10;
            }
        }
        if(current.coef==0&&current.exp==0)
        {
            
            System.out.println("this is empty insert coef,exp");
            current.coef=key.nextInt();
            current.exp=key.nextInt();
        }
        else
        {
            while(current.link!=end)
            {
                current=current.link;
            }
            ptr=new node();
            System.out.println("insert coef,exp");
            int c=key.nextInt();
            int e=key.nextInt();
            ptr.coef=c;
            ptr.exp=e;
            ptr.link=end;
            current.link=ptr;
            
        }
    }
    public static void showlist(node listnode,int a,node end)
    {
        while(a>0)
        {
            if(a==1)
            {
                current=head;
                end=tail;
                a=a-10;
            }
            else if(a==2)
            {
                current=head1;
                end=tail1;
                a=a-10;
            }
            else if(a==3)
            {
                current=head2;
                end=tail2;
                a=a-10;
            }
        }
        if(current.link==end&&current.coef==0&&current.exp==0)
        {
            System.out.println("empty");
        }
        while(current!=end)
        {
            if(current.link!=tail&&current!=end)
            {
                System.out.print(current.coef+"x"+current.exp+"^"+"+");
                current=current.link;
            }
            if(current.link==tail)
            {
                System.out.print(current.coef+"x"+current.exp+"^");
                current=current.link;
            }
            if(current==end)
            {
                System.out.println("");
            }
        }
        
    }
    public static void combin(node head,node head1,node head2,node tail,node tail1,node tail2)
    {
        current2=head2;
        current=head;
        current1=head1;
        if(current2.exp==0&&current2.coef==0&&current.link==null&&current1.link==null)//如果兩個多項式個只有一個節點
        {
            current2.exp=current1.exp*current.exp;
            current2.coef=current1.coef*current.coef;
        }
        else{
            for(int i=1;i<=c;i++)
            {
                current1=head1;
                for(int k=1;k<=c1;k++)
                {
                    if(current2.exp==0&&current2.coef==0)
                    {    
                    current2.exp=current1.exp*current.exp;
                    current2.coef=current1.coef*current.coef;
                    current1=current1.link;
                    }
                    else
                    {
                        while(current2.link!=tail2)
                        {
                            current2=current2.link;
                        }
                        ptr=new node();
                        ptr.exp=current1.exp*current.exp;
                        ptr.coef=current1.coef*current.coef;
                        ptr.link=tail2;
                        current2.link=ptr;
                        current1=current1.link;
                    }
                }
                current=current.link;
            }
            showlist(head2,3,tail2);
        }
    }
}
