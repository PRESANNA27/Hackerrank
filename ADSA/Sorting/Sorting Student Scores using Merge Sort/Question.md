In a university, students participate in an online coding competition where they receive scores based on their performance. The competition system needs to sort the scores in ascending order to display rankings properly.

As the number of participants is very large, the system requires an efficient sorting algorithm. The organizers decide to use Merge Sort, which has a stable time complexity of O(n log n), making it ideal for handling large datasets.

Your task is to write a program that takes a list of student scores and sorts them using Merge Sort, ensuring that the rankings are displayed correctly.

Input Format

An integer n representing the number of student scores.
A list of n space-separated integers, where each integer represents a student's score.
Constraints

1 ≤ n ≤ 10^5 (Up to 100,000 student scores can be sorted)
0 ≤ score ≤ 1000 (Each score is between 0 and 1000)
Scores may not be unique (Multiple students can have the same score)
Output Format

A single line containing n space-separated integers representing the sorted scores in ascending order.

Sample Input 0

6
85 72 96 65 89 75
Sample Output 0

65 72 75 85 89 96
Explanation 0

The given list [85, 72, 96, 65, 89, 75] is sorted using Merge Sort, resulting in [65, 72, 75, 85, 89, 96].

Sample Input 1

5
50 40 70 60 30
Sample Output 1

30 40 50 60 70
Explanation 1

After applying Merge Sort, the sorted order is [30, 40, 50, 60, 70], ensuring that rankings are correctly displayed.
