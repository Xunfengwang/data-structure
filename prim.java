import java.util.*;
public class prim
{
 public static void main(String [] args)
 {
     int [][]graph={
         {0,1,5,10,4},
         {1,0,2,0,1},
         {5,2,0,4,0},
         {10,0,4,0,0},
         {4,1,0,0,0}
        };
    boolean [] visited={true,false,false,false,false};
    int [] from=new int [graph.length];
    int [] to={999,999,999,999,999};
    int [] recoard={graph[0][0],999,999,999,999};
    prim(graph,visited,from,recoard,to);
 }
 public static void prim(int [][] graph,boolean [] visited,int [] from,int [] recoard,int [] to )
 {
     for(int i=0;i<graph.length;i++)
     {
         int min=999;
         int temp=0;
         for(int k=0;k<graph[0].length;k++)
         {
             /*if(recoard[i]==999)
             {
                recoard[i]=graph[i][k];
             }*/

             if(k!=0&&graph[i][k]<min&&i!=k&&graph[i][k]!=0&&visited[k]!=true)
             {
                temp=k;
                min=graph[i][k];
                //System.out.println(k+" "+min);
             }
         }
         if(min!=999&&visited[temp]!=true)
         {
            recoard[temp]=min;
            from[temp]=i;
            to[i]=temp;
            //System.out.println(temp+" from "+from[temp]+" the recoard "+recoard[temp]);
            visited[temp]=true;
            //System.out.println(visited[temp]);
         }
     }
     //print(from);
     //print(to);
     print(recoard);
 }   
 public static void print(int []arr)
 {
     for(int i=0;i<arr.length;i++)
     {
         System.out.print(arr[i]+ " ");
     }
     System.out.println(" ");
 }
}