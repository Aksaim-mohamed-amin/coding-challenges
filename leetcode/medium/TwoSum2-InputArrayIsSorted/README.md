# Two Sum II - Input Array Is Sorted

## Problem Statement

Given a **1-indexed** array of integers `numbers` that is **sorted in non-decreasing order**, find **two numbers** such that they add up to a specific `target` number.

- The solution must return the **1-based indices** `[index1, index2]`.
- You **must** use only **constant extra space**.
- The tests are generated such that there is **exactly one solution**, and you **may not use the same element twice**.

---

## Examples

### Example 1:
```
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
```

### Example 2:
```
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3. We return [1, 3].
```

### Example 3:
```
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2. We return [1, 2].
```

---

## Approach

### **Two-Pointer Approach (Optimal)**
1. **Initialize two pointers**:
    - `start = 0` → Beginning of the array.
    - `end = numbers.length - 1` → End of the array.
2. **Check the sum of `numbers[start]` and `numbers[end]`**:
    - If the sum **equals** `target`, return `[start + 1, end + 1]`.
    - If the sum **is less than** `target`, move `start++` (increase sum).
    - If the sum **is greater than** `target`, move `end--` (decrease sum).
3. **Loop until `start < end`**.

---