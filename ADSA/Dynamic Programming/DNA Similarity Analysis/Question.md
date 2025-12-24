A team of genetic scientists is studying the similarity between two DNA sequences to understand evolutionary relationships between species. DNA sequences are composed of four letters: A, C, G, and T.

To determine how closely related two DNA sequences are, the scientists want to find the length of the Longest Common Subsequence (LCS) between them.

Given two DNA sequences, help the scientists find the length of their longest common subsequence.

A subsequence is a sequence that appears in the same order but not necessarily contiguous.

Important

The subsequence does NOT require consecutive characters.
Characters must retain their order as in the original sequence.
Input Format

The first line contains a string dnaSequence1 representing the first DNA sequence.
The second line contains a string dnaSequence2 representing the second DNA sequence.
Constraints

1 <= length of dnaSequence1, dnaSequence2 <= 1000
dnaSequence1 and dnaSequence2 consist only of characters A, C, G, T.
Output Format

Output a single integer — the length of the longest common subsequence.

Sample Input 0

ACCGGTCGAGTGCGCGGAAGCCGGCCGAA
GTCGTTCGGAATGCCGTTGCTCTGTAAA
Sample Output 0

20
Explanation 0

The longest common subsequence between the two given DNA sequences is of length 20
One such LCS could be:
GTCGTCGGAAGCCGGCCGAA
(There might be multiple valid LCS.)
Sample Input 1

AGGTAB
GXTXAYB
Sample Output 1

4
Explanation 1

The longest common subsequence is GTAB of length 4.

G → G
T → T
A → A
B → B
Order is maintained.
