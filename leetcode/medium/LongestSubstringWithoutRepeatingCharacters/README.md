# Longest Substring Without Repeating Characters

## Problem Statement

Given a string `s`, find the **length** of the **longest substring** without duplicate characters.

---

## Examples

### Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

### Example 2:
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

### Example 3:
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

---

## Approach

### ✅ **Sliding Window Approach (Optimal)**
1. Use a **HashSet** to store characters in the current window.
2. Maintain two pointers:
    - `left` → Start of the window.
    - `right` → Expanding the window.
3. Iterate through `s` with `right`:
    - If `s[right]` **is in** the HashSet → Remove `s[left]`, increment `left`.
    - Otherwise, **add** `s[right]` to the HashSet and update `maxLength`.
4. The difference `(right - left + 1)` gives the current window length.