class Solution {
    public boolean checkIfPangram(String str) {
      
      HashSet<Character> hs  = new HashSet<>();
      
      for(int i=0;i<str.length();i++){
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
          hs.add(str.charAt(i));
        }
      }
      
      return (hs.size() == 26)?true:false;
        
    }
}