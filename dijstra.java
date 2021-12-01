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
        int finalpath[]=new int[6];
        finalpath[0]=0;
        int test[]=new int[6];
        test[0]=0;
        test[1]=1;
        for(int j=1;j<finalpath.length;j++)
        {
            finalpath[j]=999;
        }
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
                    if(graphic[i][k]!=0&&graphic[i][k]!=999)
                    {
                        if(graphic[i][k]<min)
                        {
                            index=k;
                            min=graphic[i][k];
                            if(min<dist[index])
                            {
                                dist[index]=min;
                                System.out.println(i+" to"+" "+index+" "+"shortest distance"+" "+min);
                                finalpath[index]=min;
                                if(finalpath[k]<finalpath[k]+graphic[i][k])
                                {
                                    finalpath[k]=graphic[i][k]+finalpath[i];
                                    path[k]=i;
                                }
                                //print(finalpath);
                            }
                        }
                    }
            }
                index=0;
                min=999;
        }
        for(int z=0;z<6;z++)
        {
            if(path[z]>0)
            {
                if(finalpath[z]>finalpath[path[z]]+dist[z])
                {
                    finalpath[z]=finalpath[path[z]]+dist[z];
                }
            }
        }
        print(finalpath);
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
    public static void cal(int[]lastpoint,int[]dist)
    {
        int []arr=new int [dist.length];
    }
}