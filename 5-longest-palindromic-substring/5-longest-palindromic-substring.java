class Solution {
    public String longestPalindrome(String s) {
       
        if(s.length()<2)
            return s;
        int maximum_length=1;
        int start =0;
        int lp,hp;

        for(int i=0;i<s.length();i++){
            lp=i-1;
            hp=i+1;
            while(hp<s.length() && s.charAt(hp)==s.charAt(i))
                hp++;

            while(lp>=0 && s.charAt(lp)==s.charAt(i))
                lp--;

            while(lp>=0 && hp<s.length()  && s.charAt(lp)==s.charAt(hp)){
                lp--;
                hp++;
            }
            int l= hp-lp-1;
            if(maximum_length<l){
                maximum_length = l;
                start=lp+1;
            }
        }
       
        return s.substring(start, start+maximum_length);
    }
}

