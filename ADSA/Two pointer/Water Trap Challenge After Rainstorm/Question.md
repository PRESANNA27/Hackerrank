In a smart irrigation simulation project, you’re given the elevation map of a futuristic city represented by an array where each element denotes the height of a vertical bar of unit width. After a heavy rainfall, water is collected in dips between the bars. Your task is to compute how many units of water the terrain can trap.

You must write a program that calculates the total trapped water.

Input Format

The first line contains an integer n – the number of elements in the array.
The second line contains n space-separated integers representing the elevation heights.
Constraints

NA

Output Format

Print a single integer – the total units of water trapped.

Sample Input 0

12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output 0

6
Explanation 0

At various points in the terrain, the dips formed between the bars allow water to accumulate.

Water trapped at each index:

Index 2: 1 unit
Index 4: 1 unit
Index 5: 2 units
Index 6: 1 unit
Index 9: 1 unit
Total = 1+1+2+1+1 = 6 units

Sample Input 1

6
4 2 0 3 2 5
Sample Output 1

9
Explanation 1

Here’s the breakdown of trapped water at each position:

Index 1: 2 units
Index 2: 4 units
Index 3: 1 unit
Index 4: 2 units
Total = 2+4+1+2 = 9 units
