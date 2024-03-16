package Week2.Day3;

import java.util.Scanner;

public class Queues {
    static Scanner sc = new Scanner(System.in);
    int[] queue = new int[5];
    int front,rear = 0;
    public void insert(int inserted_num){
        queue[front]=inserted_num;
        front++;
    }
    public void delete(){
        rear ++;
    }
    public void display(){
        for (int i = rear; i < front; i++) {
            System.out.print(queue[i]+"|\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queues q = new Queues();
        while (true) {
            System.out.println("Select an option");
            System.out.println("1: Insert Element to queue \n2. Delete Element from queue \n3. Display the queue \n4. Exit"); 
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter element to enter");
                    int num = sc.nextInt();
                    q.insert(num);
                    
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
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
