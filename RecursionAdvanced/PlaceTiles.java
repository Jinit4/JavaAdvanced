package RecursionAdvanced;

public class PlaceTiles {
    public static int tiles (int n, int m){
        //Base Case 1
        if(n == m){
            return 2;
        }

        //Base case 2
        if(n < m){
            return 1;
        }        
        //vertically
        int vertical = tiles(n-m, m);

        //horizontally
        int HorPlacements = tiles(n-1, m);

        return vertical + HorPlacements;
    }
    public static void main(String args[]){
        int n = 4, m =4;
        System.out.println(tiles(n, m));
    }
    
}
