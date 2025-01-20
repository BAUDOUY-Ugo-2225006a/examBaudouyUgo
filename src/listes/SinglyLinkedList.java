package listes;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {}

    public void add(int value) {
        if (head == null) head = new Node(value);
        else {
            Node tail = head;
            while (tail.next != null) tail = tail.next;
            tail.next = new Node(value);
        }
    }

    public SinglyLinkedList reverse() {
        SinglyLinkedList reversed = new SinglyLinkedList();
        for (Node current = head; current != null; current = current.next) {
            Node newNode = new Node(current.data);
            newNode.next = reversed.head;
            reversed.head = newNode;
        }
        return reversed;
    }

    public void printList() {
        for (Node current = head; current != null; current = current.next)
            System.out.print(current.data + " ");
        System.out.println();
    }

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
}
