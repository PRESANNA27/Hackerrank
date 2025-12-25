You are designing a code editor’s autocomplete feature that assists developers by suggesting all valid arrangements of balanced parentheses when they type a pair. Given n pairs of parentheses, you need to generate all possible valid combinations of well-formed parentheses, where every opening bracket '(' has a corresponding closing bracket ')' and no closing bracket appears before its matching opening.

This task is useful for generating valid mathematical expressions, compiler design, and solving combinatorial problems in programming tools.

Input Format

A single integer n (1 ≤ n ≤ 8), representing the number of pairs of parentheses.

Constraints

NA

Output Format

A list of strings, where each string is a valid combination of balanced parentheses. The order of combinations can be any valid order.

Sample Input 0

3
Sample Output 0

[((())), (()()), (())(), ()(()), ()()()]
Explanation 0

With 3 pairs, you can build combinations by making sure every opening '(' is eventually matched by a closing ')'. The combinations are all the valid arrangements that follow the rules of balanced parentheses.

Sample Input 1

1
Sample Output 1

[()]
Explanation 1

With only one pair, the only valid combination is "()".
