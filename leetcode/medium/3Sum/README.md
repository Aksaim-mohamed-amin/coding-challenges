# 3Sum

## Problem Statement
Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `i != k`, and `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

### Example 1:
**Input:** `nums = [-1,0,1,2,-1,-4]`

**Output:** `[[-1,-1,2],[-1,0,1]]`

### Example 2:
**Input:** `nums = [0,1,1]`

**Output:** `[]`

### Example 3:
**Input:** `nums = [0,0,0]`

**Output:** `[[0,0,0]]`

---

## Solution Approach
1. **Sort the array** to simplify finding triplets.
2. **Iterate through the array**, fixing one element `nums[i]`.
3. **Use two-pointer technique** to find pairs that sum to `-nums[i]`.
4. **Skip duplicates** to avoid repeating triplets.