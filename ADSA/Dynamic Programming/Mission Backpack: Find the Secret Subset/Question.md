You are given a list of artifacts, each with a weight value.

Your goal is to determine if there is a subset of artifacts such that the total weight equals a given target weight.

You can either include or exclude each artifact individually.

Return True if such a subset exists, otherwise return False.

Input Format

The first line contains two integers n and sum — the number of artifacts and the target weight sum.
The second line contains n space-separated integers representing the weight values of the artifacts.
Constraints

1 <= n <= 100
0 <= weight value <= 10^4
0 <= sum <= 10^4
Output Format

Output True if a subset with the given sum exists, otherwise output False.

Sample Input 0

6 9
3 34 4 12 5 2
Sample Output 0

true
Explanation 0

The subset {4, 5} adds up to 9.

Sample Input 1

6 30
3 34 4 12 5 2
Sample Output 1

false
Explanation 1

There is no subset that adds up to 30.
