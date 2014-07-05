# 2014/06/29

####
class Solution:
    # @param s, a string
    # @return a string
    def reverseWords(self, s):
        s = s.split()
        s.reverse()
        return " ".join(s)
####
    
s = Solution()
assert s.reverseWords("the sky is blue") == "blue is sky the"