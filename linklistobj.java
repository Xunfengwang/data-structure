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
    public static node ptr,current,prev,head,tem;
    
    public static void main(String []args)
    {
        head=new node();
        head.data=0;
        int num;
        while(true)
        {
            System.out.println("1 for insert end,2 for dele,3 show,4 exit");
            num=key.nextInt();
            if(num==1)
            {
                listinsert();
            }
            else if(num==2)
            {
                deletenode();
            }
            else if(num==3)
            {
                showlist();
            }
            else
            {
                System.exit(0);
            }
        }
    }
    public static void listinsert()
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
            /*if(current.data==d)
            {
                System.out.println(current.data);
                prev.next=current.next;
                current=null;
            }*/
        }
    }
    }
    public static void showlist()
    {
        current=head;
        while(current.next!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }
}
