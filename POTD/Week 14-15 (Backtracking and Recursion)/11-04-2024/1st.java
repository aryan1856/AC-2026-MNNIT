/**
 * Link - https://www.geeksforgeeks.org/problems/merge-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
 * Merge Sort
MediumAccuracy: 54.1%Submissions: 150K+Points: 4
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:
You don't need to take the input or print anything. Your task is to complete the function merge() which takes arr[], l, m, r as its input parameters and modifies arr[] in-place such that it is sorted from position l to position r, and function mergeSort() which uses merge() to sort the array in ascending order using merge sort algorithm.

Expected Time Complexity: O(nlogn) 
Expected Auxiliary Space: O(n)

Constraints:
1 <= N <= 105
1 <= arr[i] <= 105


 */

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int left = l;
        int right = m+1;
        while(left<=m && right<=r){
            if(arr[left]<=arr[right])
                list.add(arr[left++]);
            else
                list.add(arr[right++]);
        }
        while(left<=m)
            list.add(arr[left++]);
        while(right<=r)
            list.add(arr[right++]);
        for(int i=l;i<=r;i++)
            arr[i] = list.get(i-l);
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r)
            return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}