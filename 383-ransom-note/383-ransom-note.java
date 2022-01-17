class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;
        int a[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            a[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            a[ransomNote.charAt(i)-'a']--;
            if(a[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
        
    }
}

/*
if(ransomNote.length() > magazine.length())
            return false;
        int[] arr = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            arr[ransomNote.charAt(i) - 'a']--;
            if(arr[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
        */