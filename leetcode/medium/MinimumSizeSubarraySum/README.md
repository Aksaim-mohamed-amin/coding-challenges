# Minimum Size Subarray Sum

## Problem Overview
Given an array of positive integers `nums` and a positive integer `target`, return the **minimal length** of a subarray whose sum is **greater than or equal** to `target`. If there is no such subarray, return `0` instead.

### Example 1:
```txt
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

### Example 2:
```txt
Input: target = 4, nums = [1,4,4]
Output: 1
```

### Example 3:
```txt
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
```

## Solution Approach
We use the **Sliding Window Technique**:
1. Expand the window by moving the `right` pointer and adding `nums[right]` to `sum`.
2. When `sum >= target`, try **shrinking** the window from the `left` to minimize the length.
3. Keep track of the **minimum subarray length**.

## **How the Algorithm Works**
### **Step-by-Step Execution (Example 1)**
For `target = 7, nums = [2,3,1,2,4,3]`:

| `right` | `nums[right]` | `sum` (after addition) | `left` | Window `[left...right]` | `minLength` |
|---------|--------------|----------------------|--------|----------------------|------------|
| 0       | 2            | 2                    | 0      | `[2]`                | ∞          |
| 1       | 3            | 5                    | 0      | `[2,3]`              | ∞          |
| 2       | 1            | 6                    | 0      | `[2,3,1]`            | ∞          |
| 3       | 2            | 8  ✅ (≥7)            | 0      | `[2,3,1,2]`          | **4**      |
|         | Shrink → `sum -= 2` | 6              | 1      | `[3,1,2]`            | 4          |
| 4       | 4            | 10 ✅ (≥7)            | 1      | `[3,1,2,4]`          | 4          |
|         | Shrink → `sum -= 3` | 7 ✅ (≥7)       | 2      | `[1,2,4]`            | **3**      |
|         | Shrink → `sum -= 1` | 6              | 3      | `[2,4]`              | 3          |
| 5       | 3            | 9 ✅ (≥7)             | 3      | `[2,4,3]`            | **3**      |
|         | Shrink → `sum -= 2` | 7 ✅ (≥7)       | 4      | `[4,3]`              | **2** ✅   |
|         | Shrink → `sum -= 4` | 3              | 5      | `[3]`                | 2          |

**Final Output:** `2` (Subarray `[4,3]`)

---

## **Time Complexity Analysis**
- **Each element is added to `sum` once (`right` pointer moves) → O(n)**
- **Each element is removed at most once (`left` pointer moves) → O(n)**
- **Total Complexity = O(n) + O(n) = O(n)** ✅ **(Efficient!)**

---

## **Key Takeaways**
1. **Sliding Window Strategy** → Expand (`right`) and shrink (`left`) dynamically.
2. **Update `minLength` only when `sum >= target`**.
3. **Ensures the smallest valid subarray is found efficiently**.