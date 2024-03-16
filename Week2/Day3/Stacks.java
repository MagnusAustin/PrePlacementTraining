package Week2.Day3;

import java.util.Scanner;

public class Stacks {
    static Scanner sc = new Scanner(System.in);
    final int CAPACITY = 10;
    static int top = -1;
    int[] stacks = new int[CAPACITY]; 


    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is : " + stacks[top]);
            top--;
        }
    }

    public void push(int pushed_num){
        if (isFull()) {
            System.out.println("Stack is full");
        }
        else{
            top++;
            stacks[top]=pushed_num;
        }
        
    }

    public void peek(){
        System.out.println("Peeking ...\nElement is "+stacks[top]);
    }

    public boolean isFull(){
        if (top==CAPACITY) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void traverse(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("----");
            for (int i = top; i >= 0 ; i--) {
            System.out.println(" "+stacks[i]);
            System.out.println("----");
        }
        }
    }


    public static void main(String[] args) {
        Stacks s = new Stacks();
        while (true) {
            System.out.println("Select an option");
            System.out.println("1: Push Element to stack \n2. Pop Element from stack \n3. Peek in Stack \n4. Traverse through the stack \n5. Check if stack is full \n6. Check if stack is empty \n7. Exit"); 
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter element to enter");
                    int num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.traverse();
                    break;
                case 5:
                    if(s.isFull()) {
                        System.out.println("Stack is full");
                    }
                    else{
                        System.out.println("Stack has some elements");
                    }
                    break;
                case 6:
                    if(s.isEmpty()) {
                    System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Stack has some elements");
                    }
                    break;
                case 7:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
