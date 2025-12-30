Imagine you are working as a Software Engineer for a Data Processing Company. Your company handles various large-scale matrix multiplication tasks every day, as these are required for various scientific and business computations, such as 3D graphics rendering, machine learning, and big data analysis.

The company wants to optimize the time and resources it takes to multiply a sequence of matrices. Since the order in which you multiply matrices plays a key role in the number of multiplications required, the company is facing challenges in determining the most efficient way to multiply a given set of matrices.

Your task is to design an algorithm that helps the company minimize the total number of element multiplications required to multiply a sequence of matrices. Specifically, the company will provide you with the dimensions of the matrices, and you need to calculate the minimum number of multiplications required to multiply all matrices in the most efficient way.

Note

The number of matrices in the chain must be greater than 1 to perform multiplication.

Input Format

The input consists of a single integer array arr[] where each element represents the size of the matrix.
The dimensions of the ith matrix are defined as (arr[i-1] * arr[i]), where arr[i-1] represents the number of rows and arr[i] represents the number of columns of the matrix.
You need to determine the minimum number of scalar multiplications required to multiply these matrices together.
Constraints

NA

Output Format

The output should be a single integer which is the minimum number of scalar multiplications required.

Sample Input 0

2 1 3 4
Sample Output 0

20
Explanation 0

There are 3 matrices with dimensions:

Matrix 1: 2x1
Matrix 2: 1x3
Matrix 3: 3x4
To find the optimal way to multiply them, there are two possible ways:

Multiply (M1 × M2) first, resulting in a 2x3 matrix, and then multiply the result with M3 (2x3 × 3x4).
Number of multiplications: (2 × 1 × 3) + (2 × 3 × 4) = 30.
Multiply (M2 × M3) first, resulting in a 1x4 matrix, and then multiply M1 with this result (2x1 × 1x4).
Number of multiplications: (1 × 3 × 4) + (2 × 1 × 4) = 20.
The minimum cost is 20.

Sample Input 1

1 2 3 4 3
Sample Output 1

30
Explanation 1

There are 4 matrices with dimensions:

Matrix 1: 1x2
Matrix 2: 2x3
Matrix 3: 3x4
Matrix 4: 4x3
The most efficient multiplication order is:

Multiply (M1 × M2) first, resulting in a 1x3 matrix, then multiply this with M3 to get a 1x4 matrix, and finally multiply it with M4 to get the final result.
Number of multiplications: (1 × 2 × 3) + (1 × 3 × 4) + (1 × 4 × 3) = 30.
