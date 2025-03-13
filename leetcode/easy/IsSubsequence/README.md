# Is Subsequence

## Problem Statement

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A **subsequence** of a string is a new string that is formed from the original string by **deleting some (can be none) of the characters** without disturbing the relative positions of the remaining characters.

### Example 1:
```
Input: s = "abc", t = "ahbgdc"
Output: true
```

### Example 2:
```
Input: s = "axc", t = "ahbgdc"
Output: false
```

---

## Approach

### ✅ Two Pointers Approach
1. **Use two pointers `i` and `j`**:
    - `i` → Tracks characters of `s`
    - `j` → Tracks characters of `t`
2. **Iterate through `t`**:
    - If `s[i]` matches `t[j]`, move `i++`.
    - Always move `j++` to continue checking.
3. **If `i` reaches `s.length()`**, it means all characters of `s` were found in order.
