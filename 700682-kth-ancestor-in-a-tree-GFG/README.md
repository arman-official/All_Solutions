# [Kth Ancestor in a Tree](https://www.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1)
## Medium
Given a binary tree of size&nbsp; n,&nbsp;a node, and a positive integer k., Your task is to complete the function kthAncestor(), the function should return the kth ancestor of the given node in the binary tree. If there does not exist any such ancestor then return&nbsp;-1.Note: 1. It is guaranteed that the node exists in the tree.2. All the nodes of the tree have distinct values.
Examples :
Input: k = 2, node = 4Output: 1
Explanation:
Since, k is 2 and node is 4, so we first need to locate the node and look k times its ancestors. Here in this Case node 4 has 1 as his 2nd Ancestor aka the root of the tree.
Input: k=1, node=3 &nbsp; &nbsp;
Output: 1
Explanation: k=1 and node=3 ,kth ancestor of node 3 is 1.
Constraints:1&lt;=n&lt;=1051&lt;= k &lt;= 1001 &lt;= Node.data &lt;= n