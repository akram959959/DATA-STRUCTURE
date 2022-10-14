class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome == null || palindrome.length() < 2) {
            return "";
        }
        
        String candidate = "";
        char cur = ' ';
        StringBuilder sb = new StringBuilder(palindrome);
        for(int i = 0; i < palindrome.length() / 2; ++i) {
            cur = palindrome.charAt(i);
            if(cur > 'a') {
                sb.setCharAt(i, 'a');
                // found the lexicographically smallest one already
                return sb.toString();
            } else {
                // cur =='a'
                // set to cur+1;
                sb.setCharAt(i, (char) (cur + 1));
                candidate = sb.toString();
                // set it back
                sb.setCharAt(i, cur);
            }
        }
        
        for(int i = palindrome.length() / 2; i < palindrome.length(); ++i) {
            cur = palindrome.charAt(i);
            if(cur == 'a') {
                // set to cur+1;
                sb.setCharAt(i, (char) (cur + 1));
                candidate = sb.toString();
                // set it back
                sb.setCharAt(i, cur);
            }
        }
        
        return candidate;
    }
}