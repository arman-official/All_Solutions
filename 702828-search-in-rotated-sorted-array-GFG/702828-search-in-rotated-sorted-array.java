// class Solution {
//     int search(int[] a, int k) {
//         // code here
//         int i=0,j=a.length-1;
//         int m;
//         while(i<j){
//             m=i+(j-i)/2;
            
//             if(a[m]<a[m+1])i=m+1;
//             else j=m;
//         }
//         if (k >= a[i] && k <= a[j])
//             return binarySearch(a, pivot, n - 1, k);
//         else
//             return binarySearch(a, 0, pivot - 1, k);
        
//     }int fun(int[] a,int k,int i,int j){
//         int m;
//         while(i<=j){
//             m=i+(j-i)/2;
            
//             if(a[m]==k)return m;
//             else if(a[m]<k)j=m-1;
//             else i=m+1;
//         }
//         return m;
//     }
// }
class Solution {

    int search(int[] a, int k) {
        int n = a.length;

        // 1. Find pivot (index of maximum element)
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > a[high])
                low = mid + 1;
            else
                high = mid;
        }

        int pivot = low; // smallest element index

        // 2. Decide search range
        if (k >= a[pivot] && k <= a[n - 1])
            return binarySearch(a, pivot, n - 1, k);
        else
            return binarySearch(a, 0, pivot - 1, k);
    }

    int binarySearch(int[] a, int i, int j, int k) {
        while (i <= j) {
            int m = i + (j - i) / 2;

            if (a[m] == k) return m;
            else if (a[m] < k) i = m + 1;
            else j = m - 1;
        }
        return -1;
    }
}
