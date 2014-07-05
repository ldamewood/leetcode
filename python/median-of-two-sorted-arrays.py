####
# This is O(n+m)
class Solution:
    # @return a float
    def findMedianSortedArrays(self, A, B):
        if (len(A) < 1 and len(B) >= 1):
            return self.median(B)
        if (len(B) < 1 and len(B) <= 1):
            return self.median(A)
        if (len(A) < 1 and len(B) < 1):
            return None
        if (A[-1] <= B[0]):
            return self.median(A+B)
        if (B[-1] <= A[0]):
            return self.median(B+A)
        m = len(A)
        n = len(B)
        half = (m+n)/2
        # hard case, do bottom-up merge until (m+n)/2
        i = j = 0
        res = (n+m)*[0]
        for k in range(half+1):
            if (i < m and (j >= n or A[i]<=B[j])):
                res[k] = A[i]
                i+=1
            else:
                res[k] = B[j]
                j+=1
        if (m+n)%2==1:
            return res[half]
        else:
             return 0.5*(res[half-1]+res[half])  
    def median(self, A):
        A = sorted(A)
        size = len(A)
        half = size/2
        if (size%2==1):
            return A[half]
        else:
            return 0.5*(A[half-1]+A[half])
####
s = Solution()
assert s.findMedianSortedArrays([],[1]) == 1
assert s.median([-1,0,1]) == 0
assert s.median([-1,0,1,2]) == 0.5
assert s.findMedianSortedArrays([4,5],[0,1,2,3]) == 2.5
assert s.findMedianSortedArrays([3,2,1,0],[4,5]) == 2.5
import random
A = list(random.randint(1,100) for i in range(10))
B = list(random.randint(1,100) for i in range(10))
A.sort()
B.sort()
assert s.findMedianSortedArrays(A,B) == s.median(A+B)
assert s.findMedianSortedArrays([2], [1,3,4]) == 2.5