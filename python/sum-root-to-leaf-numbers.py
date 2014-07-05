# 2014/06/30

# Definition for a  binary tree node
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

####
class Solution:
    # @param root, a tree node
    # @return an integer
    def sumNumbers(self, root, string = ""):
        l = r = 0
        if (root == None):
            return 0;
        if (root.left == None and root.right == None):
            return int(string + str(root.val))
        if (root.left != None):
            l = self.sumNumbers(root.left,string + str(root.val))
        if (root.right != None):
            r = self.sumNumbers(root.right,string + str(root.val))
        return l+r
####

t = TreeNode(1)
t.left = TreeNode(2)
t.right = TreeNode(3)

s = Solution()
assert s.sumNumbers(t) == 12 + 13
t.left.left = TreeNode(4)
t.left.right = TreeNode(5)
assert s.sumNumbers(t) == 124 + 125 + 13