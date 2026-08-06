class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        list1 = nums
        list2=nums
        list1.extend(list2)
        return list1
