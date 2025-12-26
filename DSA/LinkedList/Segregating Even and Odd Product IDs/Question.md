You are managing a real-time inventory system where each product has a unique product ID stored in a linked list. To optimize product tracking, you need to segregate the product IDs into even and odd categories. All even product IDs should appear before the odd product IDs, while maintaining their original relative order within each group.

Your task is to write a program that segregates the even and odd product IDs in the linked list. After segregation, print the entire linked list with even IDs first, followed by odd IDs.

Input Format

The first line contains an integer N, the number of product IDs initially in the linked list.
The second line contains N space-separated integers representing the product IDs.
Constraints

NA

Output Format

Print the modified linked list with even IDs followed by odd IDs, with elements separated by a space.

Sample Input 0

7
101 102 103 104 105 106 107
Sample Output 0

102 104 106 101 103 105 107
Explanation 0

Initially, the product IDs are 101, 102, 103, 104, 105, 106, 107.
After segregating, the even product IDs 102, 104, 106 appear first, followed by the odd product IDs 101, 103, 105, 107.
Sample Input 1

6
2 3 4 5 6 7
Sample Output 1

2 4 6 3 5 7
