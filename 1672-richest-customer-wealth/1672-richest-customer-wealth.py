class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        money=[]
        max=0
        for account in accounts:
            total=0
            for amount in account:
                total+=amount
            money.append(total)
            if(total>max):
                max=total
        
        return max
        
