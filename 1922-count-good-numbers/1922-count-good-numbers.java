class Solution {
    public static int mod =(int)1e9+7;
    public int countGoodNumbers(long n) {
        
      if(n%2==0){
        
        return (int)((power(5,n/2)*power(4,n/2))%mod);
      }
      
     return (int)((power(5,(n/2)+1)*power(4,n/2))%mod);
   
    }
 public long power(long x,long y){
        long temp;
        if(y==0) return 1;
        temp=power(x,y/2);
   
        if(y%2==0) return (temp*temp)%mod;
        else return (x*temp*temp)%mod;
   
		// if y is odd, x power y = x power y/2 * x power y/2 * x
		// if y is even, x power y = x power y/2 * x power y/2
    }
}