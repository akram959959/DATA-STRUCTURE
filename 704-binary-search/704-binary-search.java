class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int a = 0;
        
        while(a<=n){
            int mid = (a+n) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            else if(target<nums[mid]){
                n = mid-1;
            }
            
            else if(target>nums[mid]){
                a = mid+1;
            }
        }
        
        return -1;
    }
}



