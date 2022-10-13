class Solution {
    public int numIslands(char[][] grid) {
      
      int count = 0 ;
      
      
      for(int i = 0;i<grid.length ; i++){
        for(int j=0;j<grid[i].length ; j++){
          if(grid[i][j] == '1'){
            
            count++;
            
            help(grid,i,j);
            
            
          }
        }
      }
      
      
      return count;
        
    }
  
  public void help(char[][] grid,int i,int j){
    
    if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] == '1'){
      grid[i][j] = '0';
      
      help(grid,i+1,j);
      help(grid,i-1,j);
      help(grid,i,j+1);
      help(grid,i,j-1);
    }
  }
  
}

