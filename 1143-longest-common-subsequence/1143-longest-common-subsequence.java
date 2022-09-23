class Solution {
    static int max = Integer.MIN_VALUE;
    public int longestCommonSubsequence(String text1, String text2) {
      
      int n1 = text1.length();
      int n2 = text2.length();
      
      return lcs(text1,text2,n1,n2);
        
    }
    public int lcs(String str1, String str2,int n1,int n2) {
      
      // i =n1 j =n2
      
      int dp[][] = new int[n1+1][n2+1];
      
        
      dp[0][0] = 0;
      
      for(int i=1 ; i<n1+1 ; i++){
        for(int j=1;j<n2+1 ;j++){
          
          if(str1.charAt(i-1) == str2.charAt(j-1)){
            dp[i][j] = 1+dp[i-1][j-1];
          }
          else{
            dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
          }
        }
      }
      
      return dp[n1][n2];
      
    }
}