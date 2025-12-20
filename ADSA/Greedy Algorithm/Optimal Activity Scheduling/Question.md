You are the event coordinator of a large conference center. Multiple activities are scheduled throughout the day, and each activity has a start time and an end time. However, the venue has only one hall, so no two activities can overlap.

Your goal is to select the maximum number of non-overlapping activities that can be scheduled in the hall.

You are given the start and end times of n activities. Write a program to choose the maximum number of activities that can be performed by a single person or in one room, assuming a person/room can only work on a non-overlapping schedule.

Input Format

The first line contains an integer n, the number of activities.
The next n lines each contain two space-separated integers: start and end times of the activity.
Constraints

NA

Output Format

A single integer representing the maximum number of non-overlapping activities that can be scheduled.

Sample Input 0

6
1 3
3 4
0 5
5 7
8 9
5 9
Sample Output 0

4
Explanation 0

Optimal selection of activities:

(1, 3)
(3, 4)
(5, 7)
(8, 9)
These activities do not overlap and maximize the cou

Sample Input 1

3
10 20
20 30
15 25
Sample Output 1

2
Explanation 1

Optimal selection:

(10, 20)
(20, 30)
(15, 25) overlaps with both, so it’s excluded.
