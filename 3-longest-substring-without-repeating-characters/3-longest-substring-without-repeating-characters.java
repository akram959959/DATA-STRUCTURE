class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  tl = 1;
        
        int n = s.length();
        
        if(n == 0){
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        
        while( r< n){
            if(!map.containsKey(s.charAt(r)))
                map.put(s.charAt(r), r);
            else{
                if(l <= map.get(s.charAt(r)))
                    l = map.get(s.charAt(r)) +1;
                map.replace(s.charAt(r), r);
                
            }
            r++;
            if(r-l>tl)
                 tl = r-l;
                
                
        }
        return tl;
        
    }
}