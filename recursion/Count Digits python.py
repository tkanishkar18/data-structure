class Solution:
    def countDigits(self, n):
    #  code here 
        if(n==0):
            return 0
        count=+1
        return count+self.countDigits(int(n/10))
    
s=Solution()
print(s.countDigits(0))