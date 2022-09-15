class Solution {
    public boolean canJump(int[] nums) {
      
      
      int pos = 0 ;
      int des = 0 ; 
      
      // if(nums.length >= 2 && nums[0] ==0 ){
      //   return false;
      // }
      
      if(nums.length==1){
        return true;
      }
      
      
      for(int i=0; i<nums.length-1;i++ ){
        
        des = Math.max(des,nums[i]+i);
        
        if(pos == i){
          pos = des;
          
          if(pos >= nums.length-1){
            return true;
          }
        }
        
      }
      
      return false;
        
    }
}