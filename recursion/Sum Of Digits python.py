class Solution:
    def sumOfDigits(self, n):
        # code here
        
        if(n==0):
            return 0
        output=int(n%10)
        return output+self.sumOfDigits(int(n/10))