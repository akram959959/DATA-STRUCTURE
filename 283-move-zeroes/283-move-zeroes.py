class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        for i in range(len(nums)):  
            if nums[i] == 0:    nums.append(0) or nums.remove(0)