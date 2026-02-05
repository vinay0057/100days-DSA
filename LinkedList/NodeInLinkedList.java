package LinkedList;

//Linked List is a data structure which is basically used to store 2 entities in a node.
//These 2 entities are, value which we want to store in our ds, the second entity is the reference or the
//memory address of another node.

//Head -> val/x239(memory address)


public class NodeInLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(n1.next.next.next);
        System.out.println(n4.next);

    }
}
