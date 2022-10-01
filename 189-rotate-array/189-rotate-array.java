class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k% n;
        
        reverse_arr(nums, 0, n - 1);
        reverse_arr(nums, 0, k - 1);
        reverse_arr(nums, k, n - 1);
        
        
    }
      private void reverse_arr(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
      }
    
}


  