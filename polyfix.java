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
	public static node current, prev, next, ptr, head, tmp, head1, current1, head2, current2;
    
	public static void main(String[] args) 
    { 
        head=new node(); head.link=null;
	    head1=new node();head1.link=null;
        head2=new node();head2.link=null;
        while(true)
        {
            System.out.println("1 for insert list one end,2 for insert list two end,3 show,4 show2,5 combine");
            int num=key.nextInt();
            if(num==1)
            {
                listinsert(head,1);
            }
            else if(num==2)
            {
                listinsert(head1,2);
            }
            else if(num==3)
            {
                showlist(head,1);
            }
            else if(num==4)
            {
                showlist(head1,2);
            }
            else if(num==5)
            {
                combin(head,head1,head2);
            }
            else
            {
                System.exit(0);
            }
        }
    }
    public static void listinsert(node innode,int a)
    {

        while(a>0)
        {
            if(a==1)
            {
                current=head;
                a=a-10;
            }
            else
            {
                current=head1;
                a=a-10;
            }
        }
        if(current.coef==0&&current.exp==0)
        {
            
            System.out.println("insert coef,exp");
            current.coef=key.nextInt();
            current.exp=key.nextInt();
            current.link=null;
        }
        else
        {
            while(current.link!=null)
            {
                prev=current;
                current=current.link;
            }
            ptr=new node();
            System.out.println("insert coef,exp");
            int c=key.nextInt();
            int e=key.nextInt();
            ptr.coef=c;
            ptr.exp=e;
            ptr.link=current.link;
            current.link=ptr;
            
        }
    }
    public static void showlist(node listnode,int a)
    {
        while(a>0)
        {
            if(a==1)
            {
                current=head;
                a=a-10;
            }
            else if(a==2)
            {
                current=head1;
                a=a-10;
            }
            else if(a==3)
            {
                current=head2;
            }
        }
        if(current.exp==0&&current.coef==0)
        {
            System.out.println("empty");
        }
            while(current.link!=null)
            {
                System.out.println(current.coef+"x"+current.exp+"^");
                if(current.link!=null)
                {
                    current=current.link;
                }
            }
            System.out.println(current.coef+"x"+current.exp+"^"+"1");
        
    }
    public static void combin(node head,node head1,node head2)
    {
        //head2=new node();
        current2=head2;
        current=head;
        current1=head1;
        while(current.link!=null)
        {
            while(current1.link!=null)
            {
                if(current2.exp==0&&current2.coef==0)
                {
                    current2.exp=current1.exp*current.exp;
                    current2.coef=current1.coef*current.coef;
                    System.out.println(current2.coef+","+current2.exp);
                    current1=current1.link;
                }
                else
                {
                    ptr=new node();
                    ptr.exp=current1.exp*current.exp;
                    ptr.coef=current1.coef*current.coef;
                    ptr.link=current2.link;
                    current2.link=ptr;
                    current1=current1.link;
                }
            }
            ptr=new node();
            ptr.exp=current1.exp*current.exp;
            ptr.coef=current1.coef*current.coef;
            ptr.link=current2.link;
            current2.link=ptr;
            current1=head1;
            current=current.link;
        }
        ptr=new node();
        ptr.exp=current1.exp*current.exp;
        ptr.coef=current1.coef*current.exp;
        ptr.link=current2.link;
        current2.link=ptr;
        showlist(head2,3);
    }
}
