class Solution {
    public int numDecodings(String s) {
        int count=0;
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
        if(1<=s.length())
            count+=fun(s,""+s.charAt(0),0,dp);
        if((2)<=s.length())
            count+=fun(s,""+s.charAt(0)+s.charAt(1),1,dp);
        return count;
    }
    static int fun(String s,String pass,int i,int dp[])
    {
        if(pass.charAt(0)=='0')
            return 0;
        else if(Integer.parseInt(pass)>26)
            return 0;
        else if(i==s.length()-1)
            return 1;
        if(dp[i]!=-1)
            return dp[i];
        int count=0;
        if((i+1)<s.length())
            count+=fun(s,""+s.charAt(i+1),i+1,dp);
        if((i+2)<s.length())
            count+=fun(s,""+s.charAt(i+1)+s.charAt(i+2),i+2,dp);
        dp[i]=count;
        return count;
    }
        
    
}