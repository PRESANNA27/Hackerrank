In a cryptography research lab, strings are tested for symmetry as part of a pattern recognition experiment. A string is considered significant if it contains multiple palindromic substrings—sequences that read the same backward as forward.

Given a string s, determine the total number of palindromic substrings present in it. Every single character is by default a palindromic substring. Your task is to count all such substrings (single characters, repeated characters, and mirrored sequences).

Input Format

A single string s consisting of lowercase English letters.

Constraints

NA

Output Format

A single integer representing the count of palindromic substrings.

Sample Input 0

abc
Sample Output 0

3
Explanation 0

Each character is a palindrome by itself:

"a"
"b"
"c"
Hence, total = 3

Sample Input 1

aaa
Sample Output 1

6
Explanation 1

Palindromic substrings:

"a" (at index 0)
"a" (at index 1)
"a" (at index 2)
"aa" (from index 0 to 1)
"aa" (from index 1 to 2)
"aaa" (from index 0 to 2)
Hence, total = 6
