class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum=0,total_sum=0 ,length=nums.length;
        
        if(length==1) return 0;
        for(int i=0;i<length;i++) total_sum+=nums[i];
        
        for(int i=0;i<length;i++){
            if(left_sum==(total_sum-left_sum-nums[i])){
                return i;
            }
            left_sum+=nums[i];
        }
        return -1;
    }
}