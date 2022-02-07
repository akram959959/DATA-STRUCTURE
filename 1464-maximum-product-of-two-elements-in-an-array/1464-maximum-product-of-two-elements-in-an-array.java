import java.util.Arrays;
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int res=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        
    return res;
        
        
    }
}