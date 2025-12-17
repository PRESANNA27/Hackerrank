Alex is a librarian at a large digital library where books are stored in an automated retrieval system. Each book is assigned a unique serial number, and the system maintains the list of books in sorted order. Due to the vast number of books, searching manually is inefficient. When a visitor requests a book, Alex needs to find its position in the system quickly. Given a sorted list of book serial numbers, help Alex locate the requested book's index using binary search. If the book is not available, return -1.

Input Format

The first line contains an integer N, representing the number of books in the system.
The second line contains N space-separated integers representing the sorted book serial numbers.
The third line contains an integer X, representing the target book serial number requested by a visitor.
Constraints

1 ≤ N ≤ 10^5
1 ≤ Book Serial Number ≤ 10^9
The book serial numbers are given in sorted ascending order.
Output Format

Print the 0-based index of the book where X is located.
If the book is not found, print -1.
Sample Input 0

6 
101 205 306 408 512 619 
408 
Sample Output 0

3
Explanation 0

The sorted book serial numbers are {101, 205, 306, 408, 512, 619}.

The visitor requested book 408, which is found at index 3 (0-based indexing).

Sample Input 1

5 
12 25 37 49 56 
100 
Sample Output 1

-1
Explanation 1

The visitor requested book 100, which is not present in {12, 25, 37, 49, 56}, so the output is -1.
