package listes;

public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList() {
        head = null;
    }
    public SinglyLinkedList reverse(SinglyLinkedList list) {
        SinglyLinkedList reversedList = new SinglyLinkedList();
        Node current = list.head;
        while (current != null) {
            Node temp = new Node(current.data);
            temp.next = reversedList.head;
            reversedList.head = temp;
            current = current.next;
        }
        return reversedList;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
