import java.io.*;
import java.util.*;

public class Solution {
    public static boolean binarysearch(int[][] matrix ,int m,int n,int target){
        int low = 0, high = m*n -1,mid;
        while(low <= high){
            mid = low + (high - low)/2;
            int row =mid/2;
            int col = mid%2; 
            int midvalue = matrix[row][col];
            if(midvalue == target){
                return true;
            }
            else if(target > midvalue){
                low = mid + 1;
            }
            else{
                high = mid - 1 ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n]; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(binarysearch(matrix , m, n ,target));
    }
}
