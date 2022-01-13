import java.util.Scanner;

class LinkedQueue<T>{
    private int count;
    
    public int getCount(){ 
        return 0; 
    };

    private void setCount(int count){
        this.count = count;
    }

    public void enqueue(T element){

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
