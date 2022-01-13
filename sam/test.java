import java.util.Scanner;

class LinkedQueue<T>{
    public queueNode current,head,tail,ptr;
    private int count;
    public Scanner key=new Scanner(System.in);
    public int getCount(){ 
        return 0; 
    };

    private void setCount(int count){
        this.count = count;
    }

    public void enqueue(T element){
        /*
        **假設從head開始找到tail，將新的node塞在tail後面
        */
        current=head;
        while(current!=tail)
        {
            current=current.getNextNode();
        }//直到替換到tail
        ptr=new queueNode<T>();
        ptr.setValue(key.nextInt());
        ptr.setPreNode(current);
        ptr.setNextNode(null);
        current.setNextNode(ptr);
        ptr=tail;

        /*
        current=head;
        while(current!=tail)
        {
            current=current.nextNode();
        }
        ptr=new node();
        ptr.data=key.nextInt();
        ptr.preNode=current;
        ptr.nextNode=null;
        current.nextNode=ptr;
        ptr=tail;
        */

    }

    public T dequeue()
    { 
        return null;
    }

    public T[] toArray()
    {
        return null;
    }

    private class queueNode<T>
    {
        private T value;
        private queueNode<T> nextNode;
        private queueNode<T> preNode;

        public T getValue(){

            return this.value;
        }

        private void setValue(T value)
        {
            this.value = value;
        }

        public queueNode<T> getNextNode(){
            return this.nextNode;
        }

        private void setNextNode(queueNode<T> nextNode)
        {
            this.nextNode = nextNode;
        }


        public queueNode<T> getPreNode(){
            return this.preNode;
        }

        private void setPreNode(queueNode<T> preNode)
        {
            this.preNode = preNode;
        }
    }
}

public class test {
        public static void main(String[] args) {
            System.out.println("run test....");
          
        }
}
