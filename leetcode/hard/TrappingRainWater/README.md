# Trapping Rain Water

## Problem Statement
Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

## Examples

### Example 1:
**Input:**
```plaintext
height = [0,1,0,2,1,0,1,3,2,1,2,1]
```

**Output:**
```plaintext
6
```

**Explanation:**
The above elevation map (black section) is represented by the array `[0,1,0,2,1,0,1,3,2,1,2,1]`. In this case, `6` units of rainwater (blue section) are trapped.

### Example 2:
**Input:**
```plaintext
height = [4,2,0,3,2,5]
```

**Output:**
```plaintext
9
```

## Approach
1. **Two-Pointer Technique:**
    - Use two pointers: `left` starting from index `0` and `right` starting from the last index.
    - Track the highest left (`maxL`) and highest right (`maxR`).

2. **Water Calculation:**
    - If `maxL < maxR`, update `maxL` and accumulate trapped water on the left side.
    - Otherwise, update `maxR` and accumulate trapped water on the right side.

3. **Time Complexity:**
    - The solution runs in **O(n)** time since each bar is processed once.

4. **Space Complexity:**
    - **O(1)** as no extra space is used beyond a few integer variables.

This approach efficiently determines the trapped rainwater using a single pass with two pointers.