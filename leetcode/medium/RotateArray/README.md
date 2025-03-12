# Rotate Array

## Problem Overview
Given an array `nums`, rotate it **right** by `k` steps.

### **Example 1**
**Input:**
```plaintext
nums = [1,2,3,4,5,6,7], k = 3
```
**Output:**
```plaintext
[5,6,7,1,2,3,4]
```

### **Example 2**
**Input:**
```plaintext
nums = [-1,-100,3,99], k = 2
```
**Output:**
```plaintext
[3,99,-1,-100]
```

---

## Solution Approach
Instead of shifting elements one by one, we can **reverse** parts of the array in three steps:

1. **Reverse the whole array** → moves the last `k` elements to the front (but in reverse).
2. **Reverse the first `k` elements** → puts them back in order.
3. **Reverse the rest** → restores the remaining elements.


## Why This Works
Let's take `nums = [1,2,3,4,5,6,7]` and `k = 3`:

1. **Reverse everything** → `[7,6,5,4,3,2,1]`
2. **Reverse first `k` elements** → `[5,6,7,4,3,2,1]`
3. **Reverse the rest** → `[5,6,7,1,2,3,4]`

This solution runs in **O(n)** time and uses **O(1)** extra space.
