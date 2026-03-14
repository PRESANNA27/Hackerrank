Input:  [100,4,200,1,3,2]
Output: 4 

Sequence: 1,2,3,4
Length = 4

Easy Memory Trick

Always check:

if(num-1 NOT in set)

Then start counting:

num+1, num+2, num+3...

  

import java.util.*;

public class Main {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
            set.add(num);

        int longest = 0;

        for(int num : set){

            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args){

        int nums[] = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
