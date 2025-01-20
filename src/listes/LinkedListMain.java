package listes;

public class LinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.add(2);
        singlyList.add(2);
        singlyList.add(7);
        singlyList.add(3);
        singlyList.add(4);
        System.out.println("Liste simplement chaînée de base : ");
        singlyList.printList();

        SinglyLinkedList reversedSinglyList = singlyList.reverse(singlyList);
        System.out.println("Liste simplement chaînée inversée : ");
        reversedSinglyList.printList();

        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.add(4);
        doublyList.add(4);
        doublyList.add(6);
        doublyList.add(4);
        doublyList.add(2);

        System.out.println("\nListe doublement chaînée de base :");
        doublyList.printList();

        doublyList.removeSecondLastOccurrence(4);
        System.out.println("Liste doublement chaînée après avoir enlevé l'avant derniere occurrence de 4 :");
        doublyList.printList();
    }
}
