class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;

        s=s.trim();
        
        if(s.length()==0) 
            return 0;
        
        int signedInt= +1;
        long result = 0;
        if(s.charAt(0) == '-') 
            signedInt = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            result = result * 10 + s.charAt(i)-'0';
            if(signedInt == -1 && -1*result < MIN)
                return MIN;
            if(signedInt == 1 && result > MAX)
                return MAX;
            
            i++;
        }
        
        return (int)(signedInt*result);
        
    }
}