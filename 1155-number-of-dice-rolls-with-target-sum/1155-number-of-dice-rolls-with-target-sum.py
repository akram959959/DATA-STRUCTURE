class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        #bottom up
        self.memo = {}
        return self.helper(n, target, k)%(10**9+7)
    
    def helper(self, dice_n, target, k):
        # no need to conside target less than zero cause in next for function we set target must bigger than or equal 0
        if dice_n == 0:
            return 0 if target > 0 else 1
        if (dice_n, target) in self.memo:
            return self.memo[(dice_n, target)]
        ways = 0
        # find the next possible candidate(base number)
        for base in range(max(0, target - k), target):
            ways += self.helper(dice_n - 1, base, k)
        self.memo[(dice_n, target)] = ways
        return ways