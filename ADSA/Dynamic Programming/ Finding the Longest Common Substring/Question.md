You are part of a software development team building a plagiarism detection tool for universities. One critical feature of this tool is comparing two pieces of text (for example, student assignments) and identifying the longest continuous sequence of matching characters — i.e., the longest common substring — between them.

This feature helps quickly flag potentially copied sections where large identical blocks of text appear in both submissions.

Your task is to write a program that takes two input strings (representing two documents or code files) and returns the length of their longest common substring.

Remember

A substring is a continuous block of characters. For example, in "abcde", "bcd" is a substring, but "ace" is not (since it's non-contiguous).
Matching is case-sensitive (i.e., 'A' and 'a' are considered different).
If no common substring exists, the program should return 0.
Input Format

The first line contains the string s1 (document 1).
The second line contains the string s2 (document 2).
Constraints

0 ≤ s1.length, s2.length ≤ 1000
Both strings contain only uppercase and lowercase English letters.
Output Format

A single integer representing the length of the longest common substring between s1 and s2.

Sample Input 0

abcdxyz
xyzabcd
Sample Output 0

4
Explanation 0

The longest common substring is "abcd", found at the end of s2 and the start of s1, with a length of 4.

Sample Input 1

abc
(empty string)
Sample Output 1

0
Explanation 1

Since one string is empty, there are no common substrings, so the result is 0.
