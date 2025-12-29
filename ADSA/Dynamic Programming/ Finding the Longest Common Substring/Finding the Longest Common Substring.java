import java.io.*;
import java.util.*;

public class Solution {
    public static int lcs(String str1,String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        int dp[][] = new int[s1+1][s2+1];
        int max =0;
        for(int i=1;i<=s1;i++){
            for(int j=i;j<=s2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    max = Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        System.out.println(lcs(str1,str2));
    
    }
}
