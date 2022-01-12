import java.util.Scanner;
import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Stack;
public class graph
{
    private int number = 9;  
    private boolean[] flag;  
    private String[] vertexs = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };  
    private int[][] edges = {   
            { 0, 1, 0, 0, 0, 1, 1, 0, 0 }, 
            { 1, 0, 1, 0, 0, 0, 1, 0, 1 }, 
            { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  
            { 0, 0, 1, 0, 1, 0, 1, 1, 1 }, 
            { 0, 0, 0, 1, 0, 1, 0, 1, 0 }, 
            { 1, 0, 0, 0, 1, 0, 1, 0, 0 },  
            { 0, 1, 0, 1, 0, 1, 0, 1, 0 }, 
            { 0, 0, 0, 1, 1, 0, 1, 0, 0 }, 
            { 0, 1, 1, 1, 0, 0, 0, 0, 0 }   
            };

    void DFSTravel()//橫向找，遇到1往下找
    {
        flag = new boolean[number];
        for(int i=0;i<number;i++)
        {
            if(flag[i]==false)
            {
                DFS(i);
            }
        }
    }
    void DFS(int i)
    {
        flag[i]=true;
        System.out.print(vertexs[i]+" ");
        for(int k=0;k<number;k++)
        {
            if(flag[k]=false&&edges[i][k]==1)
            {
                DFS(k);
            }
        }
    }
    void BFS()//橫向掃，用queue儲存剛剛有連接到的點，queue.poll出來作為下一個bfs的搜尋選項
    {
        flag=new boolean[number];
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<number;i++)
        {
            if(flag[i]==false)
            {
                flag[i]=true;
                System.out.print(vertexs[i]+" ");
                queue.add(i);
                while(!queue.isEmpty())
                {
                    int k=queue.poll();
                    for(int j=0;j<number;j++)
                    {
                        if(edges[k][j]==1&&flag[j]==false)
                        {
                            flag[j]=true;
                            System.out.print(vertexs[j]+" ");
                            queue.add(j);
                        }
                    }
                }
            }
        }
    }
    public static void main (String [] args)
    {
        graph graph = new graph();  
        System.out.println("DFS");
        graph.DFSTravel();
        System.out.println("");
        System.out.println("BFS");
        graph.BFS();
        System.out.println("");
    }
}