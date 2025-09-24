package DataScript;
import java.util.Scanner;
public class demoLL {

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
Node head = null;
Node tail = null;
//add a node 

void addNode(int data) {
    System.out.println("Adding node with data: " + data);
    Node newNode = new Node(data);
    // If the list is empty, set head and tail to the new node
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        // Append the new node at the end and update tail
        tail.next = newNode;
        tail = newNode;
    }
    System.out.println("Node added successfully.");
}
//display the linked list
void display() {
    if (head == null) {
        System.out.println("The list is empty.");
        return;
    }
    Node current = head;
    System.out.println("Linked List:");
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    demoLL list = new demoLL();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("1. Add Node");
        System.out.println("2. Display List");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter data to add: ");
                int data = scanner.nextInt();
                list.addNode(data);
                break;
            case 2:
                list.display();
                break;
            case 3:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}

