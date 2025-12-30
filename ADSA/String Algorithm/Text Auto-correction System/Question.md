In a smart text editor, when a user types a word incorrectly, the system suggests corrections based on the minimum number of operations needed to transform the wrong word into a correct dictionary word.

You are tasked with creating a module that calculates the minimum number of operations required to convert one string into another.

The permitted operations are:

Insert a character
Delete a character
Replace a character
Find the minimum number of operations (edit distance) required to transform one given string into another.

Input Format

The first line contains a string word1.
The second line contains a string word2.
Constraints

0 <= length of word1, word2 <= 500
word1 and word2 contain only lowercase English letters.
Output Format

Output a single integer — the minimum number of operations needed.

Sample Input 0

horse
ros
Sample Output 0

3
Explanation 0

horse → rorse (replace 'h' with 'r')
rorse → rose (delete 'r')
rose → ros (delete 'e')
Thus, minimum 3 operations are needed.

Sample Input 1

intention
execution
Sample Output 1

5
Explanation 1

intention → inention (delete 't')
inention → enention (replace 'i' with 'e')
enention → exention (replace 'n' with 'x')
exention → exection (replace 'n' with 'c')
exection → execution (replace 'e' with 'u')
Thus, minimum 5 operations are needed.
