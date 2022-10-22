class Solution {
    public boolean checkIfPangram(String str) {
      
      HashSet<Character> hs  = new HashSet<>();
       // wrapper 
      for(int i=0;i<str.length();i++){
        char c = str.charAt(i);
        if( c >= 'a' && c <= 'z'){
          hs.add(str.charAt(i));
        }
      }
      
      return (hs.size() == 26)?true:false;
        
    }
}