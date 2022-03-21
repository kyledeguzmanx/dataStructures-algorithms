class Solution {
     boolean [][] visited;
    
    public int numIslands(char[][] grid) {
        
        final int NUM_ROWS = grid.length;
        final int NUM_COLS = grid[0].length;
        visited = new boolean[NUM_ROWS][NUM_COLS];
        int numIslands = 0;
        
        
        for(int i=0; i < NUM_ROWS; i++){ //for each row...
            for(int j=0; j< NUM_COLS; j++){ //for each column
               
                //if current element is land AND it is unvisited
                if(grid[i][j] == '1' && !visited[i][j]){
                    System.out.println(i + " and " + j);
                    DFS(grid, i, j); //visit it and neighbors
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    public void DFS(char[][] grid, int row, int col){
        
        visited[row][col] = true;
        
        //check element above only if it exists, it is land, and it is unvisited
        if(row-1 >= 0 && grid[row-1][col] == '1' && !visited[row-1][col]){//if there's even an existing row above
             System.out.println("--------Inside Above----");
            visited[row-1][col] = true;
            DFS(grid, row-1, col);
        }
        
        //check element below if it exists, it is land, and it is unvisited
        if(row+1 <= grid.length-1 && grid[row+1][col] == '1' && !visited[row+1][col]){//if there's even an existing row above
             System.out.println("--------Inside Below----");
            visited[row+1][col] = true;
            DFS(grid,row+1, col);
        }
        
        //check element to the left, if it exists, it is land, and it is unvisited
         if(col-1 >= 0 && grid[row][col-1] == '1' && !visited[row][col-1]){//if there's even an existing row above
              System.out.println("--------Inside Left----");
            visited[row][col-1] = true;
            DFS(grid, row, col-1);
        }
        //check element to the right, if it exists, it is land, and it is unvisited
         if(col+1 <= grid[row].length-1 && grid[row][col+1] == '1' && !visited[row][col+1]){//if there's even an existing row above
             System.out.println("--------Inside Right----");
            visited[row][col+1] = true;
             DFS(grid, row, col+1);
        }
    }
}

/*
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

*/
