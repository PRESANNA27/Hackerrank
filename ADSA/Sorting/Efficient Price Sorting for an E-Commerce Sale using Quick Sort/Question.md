An e-commerce website is preparing for a flash sale event, where thousands of products are listed at discounted prices. To provide a seamless shopping experience, the website needs to display product prices in ascending order so that users can easily find the most affordable deals first.

Since the number of products is large, a highly efficient sorting algorithm is required to quickly arrange the prices.

Your task is to write a program that takes a list of product prices and sorts them using Quick Sort, ensuring that the website displays the products in the correct order for customers.

Input Format

An integer n representing the number of product prices.
A list of n space-separated integers, where each integer represents a product price.
Constraints

1 ≤ n ≤ 10^5 (Up to 100,000 product prices can be sorted)
1 ≤ price ≤ 10^9 (Prices are within a reasonable range)
All prices may not be unique (Some products might have the same price)
Output Format

A single line containing n space-separated integers representing the sorted product prices in ascending order.

Sample Input 0

6
499 299 999 199 799 399
Sample Output 0

199 299 399 499 799 999
Explanation 0

The given list [499, 299, 999, 199, 799, 399] is sorted using Quick Sort, resulting in [199, 299, 399, 499, 799, 999].

Sample Input 1

5
2500 1500 3500 1000 2000
Sample Output 1

1000 1500 2000 2500 3500
Explanation 1

After applying Quick Sort, the sorted order is [1000, 1500, 2000, 2500, 3500], ensuring that users see cheaper products first.
