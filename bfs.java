import java.util.Scanner;//先做走迷宮
import java.util.ArrayList;
public class bfs
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

    void DFSTravel()
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
    public static void main (String [] args)
    {
        Graph bfs=new Graph();
        System.out.println("DFS");
        bfs.DFSTravel();
    }
}