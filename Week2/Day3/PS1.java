package Week2.Day3;

import java.util.Scanner;

/**
 * PS1
 */
public class PS1 {
    static Scanner sc = new Scanner(System.in);
    final int CAPACITY = 3;
    int top = -1;
    int[] stacks = new int[CAPACITY]; 


    public int pop(){
        // if (isEmpty()) {
        //     System.out.println("Stack is empty");
        // }
        // else{
        //     System.out.println("Popped element is : " + stacks[top]);
        //     top--;
        // }
        return stacks[top--];
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
        PS1 a = new PS1();
        PS1 b = new PS1();
        PS1 c = new PS1();

        a.push(3); 
        a.traverse();
        a.push(2); 
        a.traverse();
        a.push(1); 
        a.traverse();

        c.push(a.pop()); 

        b.push(a.pop());
        b.traverse();
        b.push(c.pop());

        c.push(a.pop());
      
        a.push(b.pop());

        c.push(b.pop());
        c.push(a.pop());
        c.traverse();
    }
}