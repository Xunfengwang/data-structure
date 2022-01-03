import java.util.Scanner;//先做走迷宮
import java.util.ArrayList;
public class bfs
{private static int[][] maze =    //建立迷宫地图，0代表可走的路，1代表墙壁不可走
    {
{
1,1,1,1,1,1,1,1,1,1},
     {
1,0,0,1,0,0,0,1,0,1},
     {
1,0,0,1,0,0,0,1,0,1},
     {
1,0,0,0,0,1,1,0,0,1},
     {
1,0,1,1,1,0,0,0,0,1},
     {
1,0,0,0,1,0,0,0,0,1},
     {
1,0,1,0,0,0,1,0,0,1},
     {
1,0,1,1,1,0,1,1,0,1},
     {
1,1,0,0,0,0,0,0,0,1},
     {
1,1,1,1,1,1,1,1,1,1}};
private static ArrayList<Point> route = new ArrayList<Point>();  //走迷宫的路线

//打印输出迷宫地图
public static void main(String[] args) {

for (int i = 0; i < maze.length; i++) {

    for (int j = 0; j < maze.length; j++) {

        System.out.print(maze[i][j]+"  ");
    }
    System.out.println();
}
        /*int [][]a={
            {0,1,1,0,0,0,0,0},
            {1,0,0,1,1,0,0,0},
            {1,0,0,0,0,1,1,0},
            {0,1,0,0,0,0,0,1},
            {0,1,0,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,1,0,0,0,0,1},
            {0,0,0,1,1,1,1,0}
        };
        findconnect(a);*/
    }
    private static boolean isWalk(int[][] maze,Point currentPoint){
    
        int x = currentPoint.x;
        int y = currentPoint.y;
        //往右走
        if (maze[y][x+1]!=1 && maze[y][x+1]!=-1){
       
            route.add(new Point(x+1,y));
            return true;
        }
        //往下走
        if (maze[y+1][x]!=1 && maze[y+1][x]!=-1){
       
            route.add(new Point(x,y+1));
            return true;
        }
        //往左走
        if (maze[y][x-1]!=1 && maze[y][x-1]!=-1){
       
            route.add(new Point(x-1,y));
            return true;
        }
        //往上走
        if (maze[y-1][x]!=1 && maze[y-1][x]!=-1){
       
            route.add(new Point(x,y-1));
            return true;
        }
        return false;
    }
    /*public static void findconnect(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                {
                    System.out.println(i+": connect to "+j);
                }
            }
        }
    }*/
}