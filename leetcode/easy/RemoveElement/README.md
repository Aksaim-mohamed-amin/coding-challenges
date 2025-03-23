# Remove Element

## Problem Overview
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` **in-place**. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.

To get accepted, follow these conditions:
1. Modify `nums` so that the first `k` elements contain values that are **not** equal to `val`.
2. The remaining elements do not matter.
3. Return `k`, the number of elements not equal to `val`.

### Custom Judge:
The judge tests your solution with the following steps:
1. Calls your function `removeElement(nums, val)`.
2. Compares the returned value `k` with the expected number of valid elements.
3. Ensures that the first `k` elements in `nums` match the expected values.

## Examples

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: The function returns k = 2, with the first two elements of nums being 2.

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: The function returns k = 5, with the first five elements containing 0, 1, 4, 0, and 3.

## Solution Approach

We can solve this problem using the **two-pointer technique**:

1. Use a pointer `k` to track the position where the next valid number should be placed.
2. Iterate through `nums`:
    - If `nums[i]` is **not** equal to `val`, assign it to `nums[k]` and increment `k`.
3. Return `k` after the loop.