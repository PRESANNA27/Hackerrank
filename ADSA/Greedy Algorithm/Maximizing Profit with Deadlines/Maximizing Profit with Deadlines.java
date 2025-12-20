import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] jobId = new String[n];
        int[] deadline = new int[n];
        int[] profit = new int[n];
        int maxDeadline = 0;
        
        for (int i = 0; i < n; i++) {
            jobId[i] = sc.next();       
            deadline[i] = sc.nextInt(); 
            profit[i] = sc.nextInt();   
            if (deadline[i] > maxDeadline) {
                maxDeadline = deadline[i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (profit[i] < profit[j]) {
                   
                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;

                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;

                    String tempStr = jobId[i];
                    jobId[i] = jobId[j];
                    jobId[j] = tempStr;
                }
            }
        }

        int[] slot = new int[maxDeadline + 1]; 
        int jobCount = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = deadline[i]; j > 0; j--) {
                if (slot[j] == 0) {
                    slot[j] = 1;            
                    jobCount++;              
                    totalProfit += profit[i]; 
                    break;
                }
            }
        }

        System.out.println(jobCount + " " + totalProfit);
    }
}
