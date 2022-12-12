//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.makeProductOne(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int makeProductOne(int[] arr, int n) {
        
        int stepPos=0;
        int stepNeg=0;
        
        int zeroCount = 0;
        
        int product = 1;
        int negCount = 0;
        
        for(int i=0;i<n;i++){
            
            product *= arr[i];
            
            if(arr[i] > 1){
                stepPos += arr[i] - 1;
            }
            
            if(arr[i] < -1){
     
                stepNeg += arr[i] + 1;
            }
            
            if(arr[i] == 0 ){
                
                zeroCount++;
                
            }
            
            if(arr[i] < 0){
                negCount++;
            }
            
            
        }
        
        if(product ==1){
            return 0;
        }
        
        
        if(negCount%2 == 0){
            
            return (stepPos-stepNeg)+ zeroCount;
        }else{
            
            if(zeroCount == 0){
              return (stepPos-stepNeg) + 2;
            }else{
              return (stepPos-stepNeg)+ zeroCount;  
           }
            
        }
        
        
     
    }
};