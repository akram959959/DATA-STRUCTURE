class Solution:
    def reverseWords(self, s: str) -> str:
        a = s.split()
        a = [x[::-1] for x in a]
        a = ' '.join(a)
        return a
        
      