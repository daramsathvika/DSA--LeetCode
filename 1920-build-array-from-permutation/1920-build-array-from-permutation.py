class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        list=[-1]*len(nums)
        for num in nums:
            list[num]=nums[nums[num]]
        
        return list
        