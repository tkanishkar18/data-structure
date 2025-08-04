class Solution:
    def digitalRoot(self, n):
        #code here
        if(n<10):
            return n
        output=self.sumOfDigits(int(n))
        return self.digitalRoot(output)
    
    def sumOfDigits(self,n):
        if(n==0):
            return 0
        output1=int(n%10)
        return output1+self.sumOfDigits(int(n/10))

