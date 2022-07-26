class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_length = strs[0].length();
        String Min_String=strs[0];
        int common_length=0;
        
        for(int i = 0;i < strs.length; i++) {
            if (strs[i].length() < min_length) {
                min_length = strs[i].length();
                Min_String = strs[i];
            }
        }
        for(int i=0;i<min_length;i++) {
            for(int j = 0;j < strs.length; j++) {
             if (Min_String.charAt(i) != strs[j].charAt(i)) {
                    //"break" if characters are different
                    return Min_String.substring(0,common_length);
             }
            }
            common_length++;
        }
        if (common_length == 0) {
             return "";
         } else {
            return Min_String.substring(0,common_length);
         }
    }
}
 
       