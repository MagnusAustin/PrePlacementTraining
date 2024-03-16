import java.util.Scanner;

public class LinkedList {
    class GetNode {
        int data;
        GetNode next;

        public GetNode() {
            next = null;
        }
    }

    GetNode head;
    Scanner sc = new Scanner(System.in);

    public void append() {
        System.out.println("Enter data");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        if (newNode == null) {
            System.out.println("Memory not available");
        } else if (head == null) {
            head = newNode;
            System.out.println(data + " is added");
        } else {
            GetNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            System.out.println(data + " is added");
        }
    }

    public void traverse() {
        GetNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public void addbeg() {
        System.out.println("Enter data");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void addAfter(int key) {
        System.out.println("Enter data to add after " + key + ":");
        int data = sc.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;

        GetNode ptr = head;
        while (ptr != null) {
            if (ptr.data == key) {
                newNode.next = ptr.next;
                ptr.next = newNode;
                System.out.println(data + " is added after " + key);
                return;
            }
            ptr = ptr.next;
        }
        System.out.println("Key not found.");
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        Scanner sc1 = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Append ");
            System.out.println("2. Traverse ");
            System.out.println("3. Append(Beginning) ");
            System.out.println("4. Append(After) ");
            System.out.println("8. Exit");
            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    obj.append();
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    obj.addbeg();
                    break;
                case 4:
                    System.out.println("Enter loc");
                    int x = sc1.nextInt();
                    obj.addAfter(x);
                case 8:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc1.close();
    }
}