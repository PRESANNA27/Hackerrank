In a digital library system, there's a feature that checks whether a given phrase is a valid palindrome. A valid palindrome reads the same forwards and backwards after:

Converting all characters to lowercase.
Removing all non-alphanumeric characters (i.e., keeping only lowercase letters and digits).
Your task is to write a program to determine if the given string is a valid palindrome. Use an efficient two-pointer approach to compare characters from both ends.

Input Format

A single line string s containing letters, digits, spaces, or special characters.

Constraints

NA

Output Format

Print true if the string is a valid palindrome after cleaning.
Print false otherwise.
Sample Input 0

A man, a plan, a canal: Panama
Sample Output 0

true
Explanation 0

Convert to lowercase: a man, a plan, a canal: panama
Remove non-alphanumerics: amanaplanacanalpanama
It reads the same forward and backward → true
Sample Input 1

race a car
Sample Output 1

false
Explanation 1

Cleaned string: raceacar
Reverse: racacear
Not a palindrome → false
