class Solution {
    static boolean v_arr[][];
    public boolean exist(char[][] board, String word) {
      
      v_arr = new boolean[board.length][board[0].length];
      
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
          if(word.charAt(0)== board[i][j]  && help(board,word,i,j,0)){
            return true;
          }
        } 
      }
      
      return false;
        
    }
  
  private boolean help(char[][] board, String word,int i,int j,int idx){
    
    if(idx == word.length()){
      return true;
    }
    
    
    if(i>=board.length || i<0 || j>=board[i].length || j<0 ||
       board[i][j] != word.charAt(idx) || v_arr[i][j]){
      return false;
    }
    
    v_arr[i][j] = true;
    if(help(board,word,i-1,j,idx+1) || help(board,word,i,j-1,idx+1) || 
      help(board,word,i+1,j,idx+1)  || help(board,word,i,j+1,idx+1)){
      return true;
    }
    
    v_arr[i][j] = false;
    return false;
    
  }
}