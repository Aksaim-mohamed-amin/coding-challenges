# Contains Duplicate II

## Problem Overview
Given an integer array `nums` and an integer `k`, return `true` if there are two **distinct indices** `i` and `j` in the array such that:

1. `nums[i] == nums[j]` (they contain the same value).
2. `|i - j| <= k` (they are at most `k` indices apart).

Otherwise, return `false`.

**Example 1:**

**Input:** nums = [1,2,3,1], k = 3  
**Output:** true

**Example 2:**

**Input:** nums = [1,0,1,1], k = 1  
**Output:** true

**Example 3:**

**Input:** nums = [1,2,3,1,2,3], k = 2  
**Output:** false

## Solution
To solve this problem efficiently, we use a **HashMap** to store each number and its last seen index while iterating through the array.

### Steps:
1. Initialize a `HashMap<Integer, Integer>` to store the **last seen index** of each number.
2. Iterate through `nums`:
    - If the current number already exists in the map, check if the difference between the indices is within `k`.
    - If `|i - map.get(num)| <= k`, return `true`.
    - Otherwise, update the index of the number in the HashMap.
3. If no such pair is found, return `false`.