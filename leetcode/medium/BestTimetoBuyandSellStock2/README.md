# Best Time to Buy and Sell Stock II

## Problem Overview
You are given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day.  
You can buy and sell the stock multiple times, but you can only hold one stock at a time.  
Return the maximum profit you can achieve.

### Example 1
**Input:** prices = [7,1,5,3,6,4]  
**Output:** 7  
**Explanation:**
- Buy on day 2 (price = 1), sell on day 3 (price = 5) → profit = 4
- Buy on day 4 (price = 3), sell on day 5 (price = 6) → profit = 3
- Total profit = **7**

### Example 2
**Input:** prices = [1,2,3,4,5]  
**Output:** 4  
**Explanation:**
- Buy on day 1 (price = 1), sell on day 5 (price = 5) → profit = 4

### Example 3
**Input:** prices = [7,6,4,3,1]  
**Output:** 0  
**Explanation:**  
There is no opportunity to make a profit, so the answer is **0**.

---

## Solution Approach
Instead of waiting for the biggest single jump, we **capture every small increase**:
1. Iterate through the prices.
2. If today’s price is **higher** than yesterday's, we **sell** for a profit.
3. Accumulate all these small profits for the **maximum total profit**.