import java.util.Scanner;

public class prob1 {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }
    static class LinkedList{
        Node head,tail;
        void append (int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void printlist(){
        Node current = head;
        while (current != null){
            System.out.print(current.data +(current.next!=null ? " " : " "));
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++){
            list.append(sc.nextInt());
        }
        list.printlist();
        sc.close();


    }
    
}
}
