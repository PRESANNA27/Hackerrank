import java.util.Scanner;

class TwoStacks {
    private int[] arr;
    private int top1, top2, size;

    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int x) {
        if (top1 + 1 < top2) { 
            arr[++top1] = x;
        }
    }

    public void push2(int x) {
        if (top1 + 1 < top2) {  
            arr[--top2] = x;
        }
    }

    public void pop1() {
        if (top1 >= 0) { 
            System.out.println(arr[top1--]);
        }
    }

    public void pop2() {
        if (top2 < size) { 
            System.out.println(arr[top2++]);
        }
    }
}

public class TwoStacksInOneArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        TwoStacks stacks = new TwoStacks(n);

        while (true) {
            int command = sc.nextInt();
            if (command == -1) break; 

            if (command == 1) {
                int value = sc.nextInt();
                stacks.push1(value);
            } else if (command == 2) {
                int value = sc.nextInt();
                stacks.push2(value);
            } else if (command == 3) {
                stacks.pop1();
            } else if (command == 4) {
                stacks.pop2();
            }
        }
        sc.close();
    }
}
