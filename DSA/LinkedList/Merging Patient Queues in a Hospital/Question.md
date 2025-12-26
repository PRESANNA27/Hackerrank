n a hospital, two departments—Emergency and Outpatient—maintain their own sorted lists of patients based on the time of arrival. When a patient is ready to be treated, the hospital needs to merge these two lists into one sorted list to efficiently manage patient care and ensure that all patients are treated in the order they arrived.

For example, if the Emergency department has patients arriving at [1, 3, 5] (representing time of arrival in hours) and the Outpatient department has patients arriving at [2, 4, 6], the hospital must merge these lists to ensure the treatment occurs in the correct order. Merge two sorted linked lists into one sorted linked list

Input Format

The first line contains an integer n, representing the number of nodes in the first list.
The next line contains n integers representing the sorted values in the first list.
The following line contains an integer m, representing the number of nodes in the second list.
The last line contains m integers representing the sorted values in the second list.
Constraints

NA

Output Format

The output is a single sorted linked list containing all the nodes from both lists.

Sample Input 0

3
1 3 5
3
2 4 6
Sample Output 0

1 2 3 4 5 6
Explanation 0

The first department (Emergency) has patients arriving at [1, 3, 5], and the second department (Outpatient) has patients arriving at [2, 4, 6].

Start with the first patient from each list: compare 1 (from the Emergency list) and 2 (from the Outpatient list). Since 1 is smaller, it is added to the merged list.

Next, compare 3 and 2. Since 2 is smaller, it is added next.

Continue comparing the remaining elements in both lists until all patients are added to the merged list:

Merge steps:

1 (from Emergency)

2 (from Outpatient)

3 (from Emergency)

4 (from Outpatient)

5 (from Emergency)

6 (from Outpatient)

The merged list is [1, 2, 3, 4, 5, 6], ensuring that patients are treated in the order of their arrival.

Sample Input 1

2
5 15
4
1 2 3 10
Sample Output 1

1 2 3 5 10 15
Explanation 1

The first department (Emergency) has patients arriving at [5, 15].

The second department (Outpatient) has patients arriving at [1, 2, 3, 10].

Start with the first patient from each list: compare 5 (from the Emergency list) and 1 (from the Outpatient list). Since 1 is smaller, it is added to the merged list.

Next, compare 5 and 2. Since 2 is smaller, it is added next.

Next, compare 5 and 3. Since 3 is smaller, it is added next.

Finally, the remaining patients 5 and 10 are added in order.

The merged list is [1, 2, 3, 5, 10, 15], ensuring that patients are treated in the order of their arrival.
