# [Search in an almost Sorted Array](https://www.geeksforgeeks.org/problems/search-in-an-almost-sorted-array/1)
## Medium
Given a sorted integer array&nbsp;arr[] consisting of distinct elements, where some elements of the array are moved to either of the adjacent positions, i.e. arr[i] may be present at arr[i-1] or arr[i+1].Given an integer&nbsp;target. &nbsp;You have to return the index ( 0-based ) of the target in the array. If target is not present return -1.
Examples:
Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 40Output: 2Explanation: Index of 40 in the given array is 2.
Input: arr[] = [10, 3, 40, 20, 50, 80, 70], target = 90Output: -1Explanation: 90 is not present in the array.
Input: arr[] = [-20], target = -20Output: 0Explanation: -20 is the only element present in the array.
Constraints:1 &lt;= arr.size() &lt;= 105-109 &lt;= arr[i] &lt;= 109