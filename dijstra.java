import static java.lang.System.out;
import java.util.Scanner;

public class dijstra
{
    public static void main (String [] args)
    {
        int graphic[][]= {
            {0,1,12,999,999,999},//1
            {999,0,9,3,999,999},//2
            {999,999,0,999,5,999},//3
            {999,999,4,0,13,15},//4
            {999,999,999,999,0,4},//5
            {999,999,999,999,999,0}//6
        };
        dij(graphic,0);
    }
    public static void dij(int [][] graphic,int src)
    {
        int dist[]=new int[6];
        int path[]=new int[6];
        for(int j=1;j<dist.length;j++)
        {
            dist[0]=0;
            dist[j]=999;
        }

        for(int i=0;i<6;i++)
        {
            int min=999;int index =0;
            for(int k=0;k<6;k++)
            {
                //System.out.println(k);
                    if(graphic[i][k]!=0&&graphic[i][k]!=999)
                    {
                        if(graphic[i][k]<min)
                        {
                            
                            index=k;
                            min=graphic[i][k];
                            //System.out.print(k+","+min+" ");
                            if(min<dist[index])
                            {
                                dist[index]=min;
                                System.out.println(i+" to"+" "+index+" "+"shortest distance"+" "+min);
                            }
                        }
                    }
            }
                index=0;
                min=999;
        }
        //print(dist);
        //cal(dist);
    }
    public static void print(int[]dist)
    {
        for(int i=0;i<dist.length;i++)
        {
            
            System.out.print(dist[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    public static void cal(int[]dist)
    {
        int []arr=new int [dist.length];
        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i]);
            arr[i]=dist[i];
            if(i>0)
            {
                arr[i]=arr[i-1]+dist[i];
            }
        }
        print(arr);
    }
}