class Solution:
    def rearrangeArray(self, nums: list[int]) -> list[int]:
        ans=[]
        while nums:
            for x in sorted(set(nums)):
                ans.append(x)
                nums.remove(x)
        return ans
        