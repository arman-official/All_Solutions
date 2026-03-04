# [Number of Ways to Arrive at Destination](https://www.geeksforgeeks.org/problems/number-of-ways-to-arrive-at-destination/1)
## Medium
You are given an undirected weighted graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][], where&nbsp;edges[i] = [ui, vi, timei] means that there is an undirected edge between nodes ui&nbsp;and&nbsp;vi&nbsp;that takes&nbsp;timei minutes to reach. Your task is to return in how many ways you can travel from node 0 to node V - 1&nbsp;in the&nbsp;shortest amount of time.
Examples:
Input: V = 4, edges[][] = [[0, 1, 2], [1, 2, 3], [0, 3, 5], [1, 3, 3], [2, 3, 4]]    
Output: 2
Explanation: The shortest path from 0 to 3 is 5.
Two ways to reach 3 in 5 minutes are:
0 -&gt; 30 -&gt; 1 -&gt; 3
Input: V = 6, edges[][] = [[0, 2, 3], [0, 4, 2], [0, 5, 7], [2, 3, 1], [2, 5, 5], [5, 3, 3], [5, 1, 4], [1, 4, 1], [4, 5, 5]]    
Output: 4
Explanation: The shortest path from 0 to 5 is 7.
Four ways to reach 5 in 7 minutes are:
0 -&gt; 50 -&gt; 4 -&gt; 50 -&gt; 4 -&gt; 1 -&gt; 50 -&gt; 2 -&gt; 3 -&gt; 5
Constraints:1 ≤ V ≤ 200V - 1 ≤ edges.size() ≤ V * (V - 1) / 2
0 ≤ ui, vi ≤ V - 11 ≤ timei ≤ 105
ui&nbsp;!= vi