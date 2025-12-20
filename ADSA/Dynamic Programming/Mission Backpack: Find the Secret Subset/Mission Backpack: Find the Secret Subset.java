import java.io.*;
import java.util.*;

public class Solution {
      static boolean targetsubset(int arr[],int target)
      {
          int dp[]=new int[target+1];
          Arrays.fill(dp,-1);
          dp[0]=0;
          for(int w:arr)
          {
              for(int j=target;j>=w;j--)
              {
                  if(dp[j-w]!=-1)
                  {
                      dp[j]=Math.max(dp[j],dp[j-w]+w);
                  }
              }
          }
          return dp[target]==target;
      }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int target=obj.nextInt();
        int arr[]=new int[size];
        boolean b=false;
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        System.out.print(targetsubset(arr,target));
    }
}
