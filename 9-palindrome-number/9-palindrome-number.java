class Solution {
    public boolean isPalindrome(int x) {
     int num=x;
    
    int rev_num=0;
    while(num>0){
        int temp = num%10;
        rev_num = rev_num*10 + temp;
        num = num/10;
    }
    
    return x==rev_num;
}

    
}







