# [Shortest Path in an Undirected Graph](https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1)
## Medium
You are given a weighted undirected graph with n vertices numbered from 1 to n and m edges along with their weights. Find the shortest path between vertex 1 and vertex n.&nbsp;Each edge is given as&nbsp;{a, b, w}, denoting an edge between vertices&nbsp;a&nbsp;and&nbsp;b&nbsp;with weight&nbsp;w.
If a path exists, return a list of integers where the first element is the total weight of the shortest path, and the remaining elements are the nodes along that path (from 1 to n). If no path exists, return a list containing only {-1}.
Note:&nbsp;The driver code will internally verify your returned list.

 If both the path and its total weight are valid, only the total weight will be displayed as output.
If your list contains only&nbsp;-1, the output will be&nbsp;-1.
If the returned list is invalid, the output will be -2.

Examples :
Input: n = 5, m= 6, edges = [[1, 2, 2], [2, 5, 5], [2, 3, 4], [1, 4, 1], [4, 3, 3], [3, 5, 1]]
Output: 5
Explanation: Shortest path from 1 to n is by the path 1 4 3 5 whose weight is 5. 
Input: n = 2, m= 1, edges = [[1, 2, 2]]
Output: 2
Explanation: Shortest path from 1 to 2 is by the path 1 2 whose weight is 2. 
Input: n = 2, m= 0, edges = [ ]
Output: -1
Explanation: Since there are no edges, so no answer is possible.
Expected Time Complexity:&nbsp;O(m* log(n))Expected Space Complexity:&nbsp;O(n+m)
Constraint:2 &lt;= n &lt;= 1060 &lt;= m &lt;= 1061 &lt;= a, b &lt;= n1 &lt;= w &lt;= 105