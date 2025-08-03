class PrintNto1:
    
    def printNto1(self,num):
        self.num=num
        if(num == 0):
            return 
        print(num)
        self.printNto1(num-1)
    
  
pri= PrintNto1()
pri.printNto1(5)