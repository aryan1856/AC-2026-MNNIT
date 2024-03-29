/**
 * Link - https://leetcode.com/problems/split-array-largest-sum/description/
 * 410. Split Array Largest Sum
Solved
Hard
Topics
Companies
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= k <= min(50, nums.length)
 */

class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int left = Arrays.stream(nums).max().getAsInt();
        int right = sum(nums);
        if(k==1)
            return right;
        if(k==n)
            return left;
        int ans = 0;
        while(left<=right){
            int mid = (left+right)/2;
            int num = possibleSubarrays(nums,mid);
            if(num>k)
                left = mid+1;
            else{
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }

    private int possibleSubarrays(int arr[], int n){
        int sum = 0;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>n){
                count++;
                sum = arr[i];
            }
            else
                sum+=arr[i];
        }
        return count;
    }

    private int sum(int arr[]){
        int sum = 0;
        for(int i : arr)
            sum+=i;
        return sum;
    }
}