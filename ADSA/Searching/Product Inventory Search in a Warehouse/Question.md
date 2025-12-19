A logistics company manages a large warehouse where products are stored in a structured manner. The inventory system maintains a 2D grid, where:

Each row is sorted in non-decreasing order based on product ID.
The first product ID of each row is greater than the last product ID of the previous row.
Given a warehouse product matrix and a product ID (target), write a program to determine if the product is available in the warehouse.

To ensure fast retrieval, your solution must run in O(log(m * n)) time complexity using binary search.

Input Format

The first line contains two integers m (number of rows) and n (number of columns).
The next m lines contain n space-separated integers representing the sorted 2D matrix of product IDs.
The last line contains an integer target, representing the product ID to search for.
Constraints

1 ≤ m, n ≤ 100
-10^4 ≤ matrix[i][j] ≤ 10^4
Each row is sorted and the first element of each row is greater than the last element of the previous row.
Output Format

Print true if the product ID exists in the matrix, otherwise print false.

Sample Input 0

3 4 
1 3 5 7 
10 11 16 20 
23 30 34 60 
3 
Sample Output 0

true
Explanation 0

The product 3 exists in the warehouse matrix at position (0,1).

Sample Input 1

3 4 
1 3 5 7 
10 11 16 20 
23 30 34 60 
13 
Sample Output 1

false
Explanation 1

The product 13 is not present in the warehouse matrix.
