A publishing platform wants to enhance its editor with a quirky feature that reverses the characters of every word in a sentence, while keeping the word order and spacing intact. Your task is to implement this feature.

Given a string s representing a sentence, reverse the characters of each word in the sentence. A word is defined as a sequence of non-space characters. The sentence will contain only English letters and spaces, with words separated by a single space.

Input Format

A single line containing a string s (1 ≤ s.length ≤ 5 * 10⁴), consisting of English letters and spaces.

Constraints

NA

Output Format

Print a string where each word's characters are reversed but the original order of words and spaces is preserved.

Sample Input 0

Let's take LeetCode contest
Sample Output 0

s'teL ekat edoCteeL tsetnoc
Explanation 0

Words in the sentence: "Let's", "take", "LeetCode", "contest"

After reversing each word:

"Let's" → "s'teL"
"take" → "ekat"
"LeetCode" → "edoCteeL"
"contest" → "tsetnoc"
Combined result: "s'teL ekat edoCteeL tsetnoc"

Sample Input 1

Mr Ding
Sample Output 1

rM gniD
Explanation 1

Words: "Mr", "Ding"
After reversal: "rM", "gniD"
Final string: "rM gniD"
