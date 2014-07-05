# 2014/07/01

####
class Solution:
    # @param s, a string
    # @return a boolean
    def isPalindrome(self, s):
        i = 0        # left side of string
        j = len(s)-1 # right side of string
        while i < j:
            # Skip non-alphanumeric entries
            while not Solution.isAlphaNumeric(s[i]) and i < j:
                i+=1
            while not Solution.isAlphaNumeric(s[j]) and i < j:
                j+=-1
            # Compare entries
            if (s[i].upper() != s[j].upper()):
                return False
            i+=1
            j+=-1
        return True
    
    # Check ASCII value for alphanumeric values
    # @param s single character
    # @return boolean
    @staticmethod
    def isAlphaNumeric(s):
        c = ord(s)
        if (c >= 48 and c <= 57): return True
        if (c >= 65 and c <= 90): return True
        if (c >= 97 and c <= 122): return True
        return False
####

s = Solution()
assert s.isPalindrome("A man, a plan, a canal: Panama")
assert not s.isPalindrome("race a car")