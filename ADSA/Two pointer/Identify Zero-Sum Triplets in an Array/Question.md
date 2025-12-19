You are working as a developer for a financial analytics firm that processes large datasets of integer values representing daily profit and loss figures. Your task is to identify any three distinct entries in the dataset that together result in a net gain/loss of zero.

Write a program to return all unique triplets from the array such that the sum of the triplet is zero. Each triplet should be in non-descending order, and the list should not contain duplicate triplets.

Input Format

First line contains an integer n (3 ≤ n ≤ 10⁴) – number of elements in the array.
Second line contains n space-separated integers representing the array nums (−10⁵ ≤ nums[i] ≤ 10⁵).
Constraints

NA

Output Format

Print all unique triplets that sum to zero. Each triplet should be printed on a separate line in increasing order.

Sample Input 0

6
-1 0 1 2 -1 -4
Sample Output 0

-1 -1 2
-1 0 1
Explanation 0

Valid triplets:

(-1) + (-1) + 2 = 0
(-1) + 0 + 1 = 0
Duplicates like [-1, 2, -1] are avoided due to sorting and set usage.

Sample Input 1

5
0 1 1 -2 -1
Sample Output 1

-2 1 1  
-1 0 1
