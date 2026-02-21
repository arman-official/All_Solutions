# [Count Square Submatrices with All Ones](https://www.geeksforgeeks.org/problems/count-square-submatrices-with-all-ones/1)
## Medium
Given a N*M&nbsp;matrix of ones and zeros, return how many square submatrices have all ones.

Example 1:

Input:
N = 3
M = 4
matrix [ ][ ] =
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;[&nbsp;[0, 1, 1, 1],
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [1, 1, 1, 1],&nbsp;
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [0, 1, 1, 1] ]
Output: 15
Explanation:&nbsp;
There are 10 squares of side 1.
There are 4 squares of side 2.
There are 1&nbsp;squares of side 3.
Total number of squares = 10 + 4 + 1 =15

&nbsp;

Example 2:

Input:
N = 3
M = 3
matrix [ ][ ] =
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [&nbsp;[1, 0, 1],
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [1, 1, 0],&nbsp;
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [1, 1, 0] ]
Output: 7
Explanation:&nbsp;
There are 6&nbsp;squares of side 1.
There are 1 squares of side 2.
Total number of squares = 6&nbsp;&nbsp;+ 1 =7

&nbsp;

Your Task:
You don't need to read input or print anything. Your task is to complete the function countSquares()&nbsp;which takes the interger N, integer M&nbsp;and 2D integer&nbsp;array&nbsp;matrix[ ][ ]&nbsp;as parameters and returns the&nbsp;number of square submatrices have all ones.

Expected Time Complexity:&nbsp;O(N*M)
Expected Auxiliary Space:&nbsp;O(1)

Constraints:
1 ≤ N,M ≤&nbsp; 3*103
0 ≤ matrix [ i ][ j ]&nbsp;≤ 1
