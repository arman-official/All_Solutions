# [Frogs and Jumps](https://www.geeksforgeeks.org/problems/frogs-and-jumps--170647/1)
## Easy
N&nbsp;frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. The pond has some&nbsp;leaves arranged in a straight line. Each frog has the strength to jump exactly&nbsp;K&nbsp;leaves. For example, a&nbsp; frog having strength 2 will visit the leaves 2, 4, 6, ...&nbsp; etc. while crossing the pond. 

Given the strength of each frog and the number of leaves, your task is to find the number of leaves that not be visited by any of the frogs when all frogs have reached the other end of the pond.&nbsp;

Example 1:

Input:
N = 3
leaves = 4
frogs[] = {3, 2, 4}&nbsp;
Output: 1
Explanation:
Leaf 1 will not be visited by any frog.

Example 2:

Input: 
N = 3
leaves = 6
frogs[] = {1, 3, 5}&nbsp;
Output: 0
Explanation: 
First frog will visit all the leaves so no 
leaf is left unvisited.

Your Task:
Complete the function unvisitedLeaves() which takes the integers N, leaves&nbsp;and the array frogs&nbsp;as the input parameters, and returns the number of unvisited leaves.

Expected Time Complexity:&nbsp;O(N*log(leaves))
Expected Auxiliary Space:&nbsp;O(leaves)

Constraints:
1 ≤ N, leaves, frogs[i] ≤ 105
