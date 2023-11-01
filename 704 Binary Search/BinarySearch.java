// Source: https://leetcode.com/problems/binary-search/
// Author: John Dwyer
// Date: 11/1/2023

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 
Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.
 */

class BinarySearch {

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            
            if (num == target) {
                return mid;
            }
            else if (mid > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {

        // Test1: target does not exist in array
        int[] arr1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 2;
        System.out.println("Test1: Expected: -1, Actual: " + search(arr1, target1));

        // Test2: target exists in array
        int[] arr2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 9;
        System.out.println("Test2: Expected: 4, Actual: " + search(arr2, target2));
    }
}
