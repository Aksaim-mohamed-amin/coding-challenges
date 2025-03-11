# Best Time to Buy and Sell Stock

## Problem Overview
You are given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day.
You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.
Return **the maximum profit** you can achieve from this transaction. If you cannot achieve any profit, return `0`.

**Example 1:**

**Input:** prices = [7,1,5,3,6,4]
**Output:** 5
**Explanation:** Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

**Example 2:**

**Input:** prices = [7,6,4,3,1]
**Output:** 0
**Explanation:** In this case, no transactions are done and the max profit = 0.

## Solution
To solve this problem, we need to carefully track two things while iterating through the list of prices:

1. **The minimum price** seen so far:
    - As we go through the list, we want to keep track of the lowest price we've seen. This helps us know the best day to buy.

2. **The maximum profit**:
    - On each day, calculate the profit if we sold at the current day's price, using the minimum price we've seen so far. The profit is calculated as:
   ```
   profit = prices[i] - minPrice
   ```

Finally, return the maximum profit found.