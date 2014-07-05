# 2014/07/01

####
class Solution:
    # @return a tuple, (index1, index2)
    def twoSum(self, num, target):
        idx = sorted((val,i) for i,val in enumerate(num)) # N LogN time
        
        # Ignore parts of the array that are larger than (target - min)
        end = 0;
        while (end < len(num) and idx[end][0] <= target - idx[0][0]):
            end+=1
        idx = idx[:end]
        
        # Create index list
        idx = [l[1] for l in idx]
        
        for i in idx:
            check = target - num[i]
            # Binary search
            j = Solution.search(num,idx,check)
            if j > -1: return tuple(sorted([i+1,j+1]))

    @staticmethod
    def search(num,idx,val):
        if len(idx)<1: return -1
        half = len(idx)/2
        if (num[idx[half]] == val):
            return idx[half]
        elif (num[idx[half]] < val):
            return Solution.search(num, idx[half+1:],val)
        else:
            return Solution.search(num, idx[:half],val)
####

s = Solution()
assert s.twoSum([2, 7, 11, 15], 9) == (1,2)
assert s.twoSum([5,75,25], 100) == (2,3)
assert s.twoSum([0,4,3,0], 0) == (1,4)
assert s.twoSum([-3,4,3,90], 0) == (1,3)