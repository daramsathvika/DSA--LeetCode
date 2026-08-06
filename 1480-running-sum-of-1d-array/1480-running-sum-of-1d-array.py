class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        list=[0]*len(nums)
        list[0]=nums[0]
        for i in range(1,len(nums)):
            list[i]=nums[i]+list[i-1]
        return list
        