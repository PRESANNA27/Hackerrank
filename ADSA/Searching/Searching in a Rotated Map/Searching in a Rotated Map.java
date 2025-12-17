import java.io.*;
import java.util.*;

public class Solution {
    public static int bs(int[] arr , int target){
        int left = 0, right = arr.length-1 , mid;
        while(left <= right){
            mid = left + (right - left)/2 ;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
                    right = mid-1;
                }
                else{
                    left =mid+1;
                }
            }
            else{
                if(target > arr[mid] && arr[right] >= target){
                    left = mid +1;
                }
                else{
                    right = mid-1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = bs(arr,target);
        System.out.print(index);
    }
}
