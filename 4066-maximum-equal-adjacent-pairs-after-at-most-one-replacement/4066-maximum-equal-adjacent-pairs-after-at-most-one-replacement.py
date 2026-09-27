class Solution:
    def maxEqualAdjacentPairs(self, nums: list[int]) -> int:
        bs=sum(u==v for u,v in zip(nums,nums[1:]))
        mp=[
            (min(u,v),max(u,v))
            for u,v in zip(nums,nums[1:]) if u!=v
        ]
        c=Counter(mp)
        mg=max(c.values()) if c else 0
        return bs+mg
        