class Solution {
    public int[] twoSum(int[] nums, int target) {
      
      HashMap<Integer,Integer> hm = new HashMap<>();
      
       for(int i=0;i<nums.length;i++){
         if(hm.containsKey(nums[i])){
           // hm.put(nums[i],hm.get(nums[i])+1);
           continue;
         }
         else
           hm.put(nums[i],i);
       }
      
      System.out.print(hm);
      for(int i=0;i<nums.length;i++){
        if(hm.containsKey(target-nums[i]) && i!=hm.get(target-nums[i])){
          return new int[]{i,hm.get(target-nums[i])};
        }
      }
      
      return nums;
        
    }
}