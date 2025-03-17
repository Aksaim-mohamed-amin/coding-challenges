# Isomorphic Strings

## Problem Statement
Given two strings `s` and `t`, determine if they are isomorphic.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`.

- All occurrences of a character must be replaced with another character while preserving the order of characters.
- No two characters may map to the same character, but a character may map to itself.

### Example 1:
**Input:**
```
s = "egg", t = "add"
```
**Output:**
```
true
```
**Explanation:**
- 'e' maps to 'a'.
- 'g' maps to 'd'.

### Example 2:
**Input:**
```
s = "foo", t = "bar"
```
**Output:**
```
false
```
**Explanation:**
- The mapping is inconsistent ('o' maps to both 'a' and 'r').

### Example 3:
**Input:**
```
s = "paper", t = "title"
```
**Output:**
```
true
```
**Explanation:**
- 'p' → 't', 'a' → 'i', 'p' → 't', 'e' → 'l', 'r' → 'e'
- The mapping is consistent.

---

## Approach

### **HashMap Method**
1. Use two **HashMaps**:
    - `mapST`: Maps each character in `s` to `t`.
    - `mapTS`: Maps each character in `t` to `s`.
2. Traverse both strings:
    - If `s[i]` was mapped before, check if it maps correctly to `t[i]`, if not return `false`.
    - If `t[i]` was mapped before, check if it maps correctly to `s[i]`, if not return `false`.
    - If not mapped yet, add the mapping.
3. If all mappings are consistent, return `true`.