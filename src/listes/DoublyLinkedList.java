package listes;

public class DoublyLinkedList {
    private Node head;
    public DoublyLinkedList() {
        head = null;
    }
    public void removeSecondLastOccurrence(int data) {
        Node current = head;
        Node lastOccurrence = null;
        Node secondLastOccurrence = null;
        while (current != null) {
            if (current.data == data) {
                secondLastOccurrence = lastOccurrence;
                lastOccurrence = current;
            }
            current = current.next;
        }
        if (secondLastOccurrence != null) {
            if (secondLastOccurrence.prev != null) {
                secondLastOccurrence.prev.next = secondLastOccurrence.next;
            } else { 
                head = secondLastOccurrence.next;
            }
            if (secondLastOccurrence.next != null) {
                secondLastOccurrence.next.prev = secondLastOccurrence.prev;
            }
        }
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
            newNode.prev = current;
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
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
