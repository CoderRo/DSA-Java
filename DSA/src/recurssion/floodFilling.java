package recurssion;

public class floodFilling {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    public static boolean validateBoundaries(int row, int col, int drow, int dcol ) {
        if ( drow >= 0 || drow < row || dcol >= 0 || dcol < col ) {
            return true;
        }
        return false;
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        int row = maze.length;
        int col = maze[0].length;
        if ( sr == row - 1 && sc == col -1 ) {
            System.out.println(asf);
            return;
        }
        
        int dc;
        int dr;
        // -1 represnt visited
        // Cheching top coloumn
        dc = sc;
        dr = sr - 1;
        if ( validateBoundaries(row , col , dr, dc) == true && maze[dr][dc] != -1 && maze[dr][dc] != 1 ) {
            maze[dr][dc] = -1;
            floodfill(maze, dr ,dc ,asf + "t");
        }
        maze[dr][dc] = 0;

        // Cheching left coloumn
        dc = sc - 1;
        dr = sr;
        if ( validateBoundaries(row , col , dr, dc) == true && maze[dr][dc] != -1 && maze[dr][dc] != 1 ) {
            maze[dr][dc] = -1;
            floodfill(maze, dr ,dc ,asf + "l");
        }
        maze[dr][dc] = 0;

        // Cheching down coloumn
        dc = sc;
        dr = sr + 1;
        if ( validateBoundaries(row , col , dr, dc) == true && maze[dr][dc] != -1 && maze[dr][dc] != 1 ) {
            maze[dr][dc] = -1;
            floodfill(maze, dr ,dc ,asf + "d");
        }
        maze[dr][dc] = 0;

        // Cheching top coloumn
        dc = sc + 1;
        dr = sr;
        if ( validateBoundaries(row , col , dr, dc) == true && maze[dr][dc] != -1 && maze[dr][dc] != 1 ) {
            maze[dr][dc] = -1;
            floodfill(maze, dr ,dc ,asf + "r");
        }
        maze[dr][dc] = 0;
    }
}
