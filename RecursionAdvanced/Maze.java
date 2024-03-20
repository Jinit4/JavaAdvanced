package RecursionAdvanced;

public class Maze {
    public static int countPaths (int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        //Base case will be
        if (i == n-1 && j == m-1){
            return 1; 
        }
        //Move Downwards
        int downPaths =countPaths(i+1, j, n, m); //i+1, j will move downwards
        //Move Right
        int rightPaths = countPaths(i, j+1, n,m ); //i, j+1 will move right in the maze
        return downPaths + rightPaths; //Here we will return totalpaths
    }
    public static void main (String args[]){
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
