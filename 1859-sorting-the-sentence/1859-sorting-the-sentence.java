class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        String result[]=new String[a.length];
        for(int i=0;i<a.length;i++){
            String b=a[i];
            int index=b.charAt(b.length()-1)-'0';
            b=b.substring(0,b.length()-1 );
            result[index-1]=b;
        }
        return String.join(" ",result);
        
    }
}


/*String str[] = s.split(" ");
        String ans[] = new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            String st = str[i];
            int ind = st.charAt(st.length()-1) - '0';
            st=st.substring(0, st.length() - 1);  
            ans[ind-1]=st;
            
        }
        return String.join(" ", ans);
*/