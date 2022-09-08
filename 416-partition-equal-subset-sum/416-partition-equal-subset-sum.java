class Solution {
  public int subsetSum(int a[],int n,int sum){
        
        int dp[][] = new int[n+1][sum+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0) dp[i][j]=0;
                if(j==0) dp[i][j]=1;
                
                if(i>0 && j>0){
                    
                    if(j<a[i-1]){
                        dp[i][j] = dp[i-1][j];
                    } 
                    else{
                         dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][j-a[i-1]]);
                    }
                }
            }
        }
        
        return (dp[n][sum])>0?1:0;
        
    }
    public boolean canPartition(int[] nums) {
      
      int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2 !=0){
            return false;
        }
        
        return subsetSum(nums,nums.length,sum/2)>0?true:false;
        
    }
}