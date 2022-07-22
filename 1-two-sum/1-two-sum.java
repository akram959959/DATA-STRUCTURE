class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(nums[i])) {
                return new int[] { map.get(num), i };
            }

            map.put(target - num, i);
        }

        return new int[] {};
        
    }
}