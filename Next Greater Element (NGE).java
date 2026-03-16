Input
n = 4
13 7 6 12

output
13 -> -1
7  -> 12
6  -> 12
12 -> -1

import java.util.*;

class Main {

    public static void nextGreaterElement(int[] arr){

        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty())
                System.out.println(arr[i] + " -> -1");
            else
                System.out.println(arr[i] + " -> " + stack.peek());

            stack.push(arr[i]);
        }
    }

    public static void main(String[] args){

        int[] arr = {13,7,6,12};

        nextGreaterElement(arr);
    }
}
