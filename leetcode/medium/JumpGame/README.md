# Jump Game

## Problem Overview
You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return **true** if you can reach the last index, or **false** otherwise.

### Example 1:
**Input:** nums = [2,3,1,1,4]  
**Output:** true  
**Explanation:** Jump 1 step from index 0 to 1, then 3 steps to the last index.

### Example 2:
**Input:** nums = [3,2,1,0,4]  
**Output:** false  
**Explanation:** You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

## Solution
To solve this problem, we will use a greedy approach. The idea is to track the **maximum index we can reach** as we iterate through the array. If at any point we are stuck (i.e., `i > maxReach`), we return `false`. If at any point `maxReach` is greater than or equal to the last index, we return `true`.

### Steps:
1. **Initialize `maxReach` to 0**. This variable will store the farthest index we can reach.
2. **Iterate through the array**:
    - If the current index `i` is greater than `maxReach`, we are stuck, so return `false`.
    - Otherwise, update `maxReach` to the maximum of the current `maxReach` and `i + nums[i]`.
    - If at any point `maxReach` is greater than or equal to the last index (`nums.length - 1`), return `true`.
3. **Return `true`** if we can reach the last index, or **false** if we cannot.