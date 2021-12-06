import static java.lang.System.out;
import java.util.Scanner;
class node
{
    public int data;
    public node next;
    public void node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linklistobj
{
    static Scanner key=new Scanner(System.in);
    public static node ptr,current,prev,prev1,head,tem,tem1,head1,current1;
    
    public static void main(String []args)
    {
        head=new node();
        head.data=0;
        int num;
        head1=new node();
        head1.data=0;
        while(true)
        {
            System.out.println("1 for insert end,2 for dele,3 show,4 cardshuffel,5 exit");
            num=key.nextInt();
            if(num==1)
            {
                listinsert(head);
                listinsert(head1);
            }
            else if(num==2)
            {
                deletenode();
            }
            else if(num==3)
            {
                showlist(head);
                showlist(head1);
            }
            else if(num==4)
            {
                cardShuffle(head,head1);
            }
            else
            {
                System.exit(0);
            }
        }
    }
    public static void listinsert(node head)
    {
        current=head;
        System.out.println("Please input number:");
        if(head.next==null&&head.data==0)
        {
            head.data=key.nextInt();
        }
        else
        {
            while(current.next!=null)
            {
                prev=current;
                current=current.next;
            }
            if(current.next==null)
            {
                ptr=new node();
                ptr.data=key.nextInt();
                ptr.next=current.next;
                current.next=ptr;
            }
        }
    }
    public static void deletenode()
    {
        current=head;
        if(head.data==0)
        {
            System.out.println("empty");
        }
        else
        {
            System.out.println("input what delete:");
            int d=key.nextInt();
            if(current.data==d&&current==head)
            {
                System.out.println(current.data);
                    tem=current.next;
                    current=null;
                    head=tem;
                    current=head;
            }
            else{
                while(current.data!=d&&current.next!=null)
                {
                    System.out.println(current.data+"now data");
                    prev=current;
                    current=current.next;
                    if(current.data==d)
                    {
                        System.out.println(current.data+"will be deleted");
                        prev.next=current.next;
                    }
                    else if(current.data!=d&&current.next==null)
                    {
                        System.out.println(current.data+"now data");
                        System.out.println("not found");
                    }
                }
        }
    }
    }
    public static void showlist(node head)
    {
        current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
    public static void cardShuffle(node head,node head1)
    {
        int c=0;
        current=head;
        current1=head1;
        while(true)
        {
            while(current.next!=null&&current1.next!=null)
            {
                if(tem==null&&tem1==null)
                {
                    System.out.println(current.next.data);
                    System.out.println(current1.next.data);
                    tem=current.next;
                    tem1=current1.next;
                    current.next=current1;
                    prev=current1;
                    c++;
                    current=tem;current1=tem1;
                }
                else
                {
                    tem=current.next;
                    tem1=current1.next;
                    current.next=current1;
                    prev=current1;
                    current=tem;current1=tem1;
                }
            }
            if(current.next==null&&current1.next==null)
            {
                    prev.next=current;
                    current.next=current1;
                    break;
            }
            break;
        }
        showlist(head);
    }
}
