class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        a = [[ 0 for i in range(target+1)] for j in range(n+1)]
        a[0][0] = 1;
        mod = 10**9 + 7
        for i in range(1,n+1):
            for j in range(1,target+1):
                f=1
                while f<= min(j,k):
                    a[i][j] = (a[i][j] + a[i-1][j-f]) %mod
                    f+=1
        return a[n][target]%mod
                
        
     