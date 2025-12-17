An archaeologist named Alex is exploring an ancient temple with a map containing treasure locations. The locations are marked in ascending order, but due to an earthquake, the map has been rotated at an unknown pivot, making it difficult to search for a specific treasure.

Alex needs your help to find a specific treasure location efficiently. Given a rotated sorted list of treasure locations and a target location, write an efficient algorithm to find the target's index. If the target is not found, return -1.

Your solution must run in O(log n) time complexity.

Input Format

The first line contains an integer N, representing the number of treasure locations.
The second line contains N space-separated integers representing the rotated sorted list of treasure locations.
The third line contains an integer X, representing the treasure location Alex wants to find.
Constraints

1 ≤ N ≤ 10^5
-10^9 ≤ Treasure Location ≤ 10^9
All values in the array are distinct.
The array was originally sorted in ascending order before rotation.
Output Format

Print the 0-based index of the treasure location where X is found.
If the treasure location is not found, print -1.
Sample Input 0

7 
4 5 6 7 0 1 2 
0 
Sample Output 0

4
Explanation 0

The original sorted list was {0,1,2,4,5,6,7} before being rotated at index 3.

The target location 0 is found at index 4.

Sample Input 1

7 
4 5 6 7 0 1 2 
3 
Sample Output 1

-1
Explanation 1

The target 3 is not in the rotated sorted list, so the output is -1.

Sample Input 2

1 
1 
0 
Sample Output 2

-1
Explanation 2

Since there's only one treasure location (1) and Alex is searching for 0, it is not found.
