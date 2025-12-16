In a system where sensor data is collected in cycles, each batch of data is stored as an array. Sometimes, due to calibration delays, the system must adjust the data stream by rotating the array elements a certain number of times to the right.

You are tasked with implementing a program that rotates the elements of the array k times to the right, such that the last k elements move to the front of the array and the rest shift to the right.

Input Format

First line: space-separated integers representing the array elements.
Second line: an integer k representing the number of steps to rotate the array to the right.
Constraints

NA

Output Format

Space-separated integers representing the rotated array.

Sample Input 0

1 2 3 4 5 6 7
3
Sample Output 0

5 6 7 1 2 3 4
Explanation 0

Initial array: [1,2,3,4,5,6,7]
After 1 right rotation: [7,1,2,3,4,5,6]
After 2 right rotations: [6,7,1,2,3,4,5]
After 3 right rotations: [5,6,7,1,2,3,4]
Sample Input 1

-1 -100 3 99
2
Sample Output 1

3 99 -1 -100
Explanation 1

Initial array: [-1,-100,3,99]
After 1 right rotation: [99,-1,-100,3]
After 2 right rotations: [3,99,-1,-100]
