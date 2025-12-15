Alex is a librarian who needs to find a specific book in a row of shelves. Each shelf has a unique ID, and the books are arranged randomly on the shelves. Given a list of shelf IDs and a target shelf ID, help Alex determine the position of the target shelf in the list. If the shelf is not found, return -1.

Input Format

The first line contains an integer N, representing the number of shelves.
The second line contains N space-separated integers representing the shelf IDs.
The third line contains an integer X, representing the target shelf ID to be found.
Constraints

NA

Output Format

Print the 0-based index of the shelf where X is located.
If the shelf is not found, print -1.
Sample Input 0

5 
10 20 30 40 50 
30 
Sample Output 0

2
Explanation 0

The shelf IDs are {10, 20, 30, 40, 50}. The target shelf ID 30 is at index 2 (0-based indexing), so the output is 2.

Sample Input 1

4
5 15 25 35 
50 
Sample Output 1

-1
Explanation 1

The target shelf ID 50 is not found in {5, 15, 25, 35}, so the output is -1.
