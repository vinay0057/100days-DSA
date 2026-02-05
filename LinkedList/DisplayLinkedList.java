package LinkedList;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

public class DisplayLinkedList {

    public static void display(Node node){
        Node i = node;
        while(i != null){
            System.out.println(i.val);
            i = i.next;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(11); //0
        Node n2 = new Node(29); //1
        Node n3 = new Node(31); //2
        Node n4 = new Node(46); //3

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        /*display(n1);
        System.out.println("-----");
        displayRec(n2);*/

        System.out.println(get(n1, 3));;
    }

    public static void displayRec(Node node){
        if(node == null) return;
        //System.out.println(node.val); we can print ll from start to end
        displayRec(node.next);
        System.out.println(node.val); // also in reverse as well
    }

    public static int get(Node node, int idx){
        /*Node i = node;
        int count = -1;
        int ans = 0;
        while(i != null){
            count++;
            if(count == idx) {
                ans = i.val;
                break;
            }
            i = i.next;
        }*/

        if(idx == 1) return node.val;
        int i = 2;
        while(i <= idx){
            node = node.next;
            i++;
        }
        return node.val;
    }

}
