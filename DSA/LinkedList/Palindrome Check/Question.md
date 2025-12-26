You are managing an order tracking system for an e-commerce platform, where each order has a unique tracking ID. The system maintains these tracking IDs in a linked list for real-time monitoring. After every few hours, you need to check if the sequence of tracking IDs forms a palindrome, which means the list reads the same forward and backward.

For example, if the tracking IDs are 121, 202, 121, then the list is a palindrome, as it reads the same in both directions. You are required to implement a program that checks whether the sequence of tracking IDs is a palindrome or not.

Input Format

The first line contains an integer N, the number of tracking IDs initially in the system.
The second line contains N space-separated integers representing the tracking IDs.
Constraints

NA

Output Format

Print "Yes" if the tracking ID sequence is a palindrome.
Print "No" if the sequence is not a palindrome.
Sample Input 0

5
121 202 303 202 121
Sample Output 0

Yes
Explanation 0

Initially, the linked list contains 121, 202, 303, 202, 121. Since the sequence reads the same forward and backward, the output is "Yes."

Sample Input 1

4
1 2 3 1
Sample Output 1

No
Explanation 1

In the list 1 2 3 1, the middle element is identified as 3, and the second half (3 1) is reversed to become 1 3. When comparing the first half (1 2) with the reversed second half (1 3), the values do not match at the second position (2 vs. 3). Since the halves differ, the list is not a palindrome, so the output is "No."
