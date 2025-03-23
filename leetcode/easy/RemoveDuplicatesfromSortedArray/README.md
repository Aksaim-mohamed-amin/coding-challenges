# Remove Duplicates from Sorted Array

## Problem Overview
Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only **once**. The relative order of the elements should be **kept the same**. Then return the number of **unique elements** in `nums`.

To get accepted, follow these conditions:
1. Modify `nums` so that the first `k` elements contain the **unique** values in order.
2. The remaining elements do not matter.
3. Return `k`, the number of unique elements.

### Custom Judge:
The judge tests your solution with the following steps:
1. Calls your function `removeDuplicates(nums)`.
2. Compares the returned value `k` with the expected number of unique elements.
3. Ensures that the first `k` elements in `nums` match the expected values.

## Examples

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: The function returns k = 2, with the first two elements of nums being 1 and 2.

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: The function returns k = 5, with the first five elements being 0, 1, 2, 3, and 4.

## Solution Approach

We can solve this problem using the **two-pointer technique**:

1. Use a pointer `k` to track the position of the last unique element.
2. Iterate through `nums`:
    - If `nums[i]` is **different** from `nums[k]`, update `nums[k+1]` and move `k` forward.
3. Return `k + 1` after the loop.