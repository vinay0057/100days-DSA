package LinkedList;

class MyNode{
    int val;
    MyNode next;

    public MyNode(int val){
        this.val = val;
    }
}

class LinkedList{
    MyNode head;
    MyNode tail;

    public void addTail(int num){
        MyNode n1 = new MyNode(num);
        if(tail == null) head = tail = n1;
        else{
            MyNode temp = tail;
            tail = n1;
            temp.next = tail;
        }
    }
    public void addHead(int num){
        MyNode n1 = new MyNode(num);
        if(head == null) head = tail = n1;
        else{
            MyNode temp = head;
            head = n1;
            head.next = temp;
        }
    }

    public void display(){
        PractisingLinkedList.display(head);
    }

    public void get(int idx){
        int num = PractisingLinkedList.getElementByIndex(head, idx);
        System.out.println(num);
    }

    public void addBtw(int num, int idx){
        MyNode new_node = new MyNode(num);
        if(idx == 0){
            addHead(num);
            return;
        }

        MyNode prev_node = PractisingLinkedList.getNodeByIndex(head, idx-1);
        MyNode current_node = PractisingLinkedList.getNodeByIndex(head, idx);

        prev_node.next = new_node;
        new_node.next = current_node;

    }

    public int size(){
        int size = PractisingLinkedList.size(head);
        return size;
    }

    public void removeHead() {
        if (head == null) return;        // empty list
        if (head == tail) {              // single node
            head = tail = null;
        } else {
            head = head.next;
        }
    }


}

public class PractisingLinkedList {
    public static void main(String[] args) {
        /*MyNode n1 = new MyNode(10);
        MyNode n2 = new MyNode(20);
        MyNode n3 = new MyNode(30);
        MyNode n4 = new MyNode(40);
        MyNode n5 = new MyNode(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(n2); //n2 have its own memory address
        System.out.println(n1.next); //n1.next holds the same memory address as n2

        display(n1);*/

        LinkedList ls = new LinkedList();
        ls.addTail(10);
        ls.addTail(20);
        ls.addTail(30);
        ls.addTail(40);
        ls.addTail(50);

        //ls.get(1);
        ls.addBtw(999, 1);
        ls.addBtw(1000, 2);
        ls.addBtw(98, 1);
        ls.addBtw(9, 0);
        System.out.println("before");
        ls.display();

        System.out.println("after");
        ls.removeHead();
        ls.display();

        //System.out.println("length of ll: "+ls.size());
    }

    public static void display(MyNode node){
        MyNode i = node;
        while(i != null){
            System.out.println(i.val);
            //System.out.println("Node info" +i.next);
            i = i.next;
        }
    }

    public static int size(MyNode node){
        MyNode i = node;
        int size = 0;
        while(i != null){
            size += 1;
            i = i.next;
        }
        return size;
    }

    public static int getElementByIndex(MyNode node, int idx){
        int i = 0;
        int result = 0;
        MyNode j = node;
        while(j != null){
            if(i == idx) {
                result = j.val;
                break;
            }
            i++;
            j = j.next;
        }
        return result;
    }

    public static MyNode getNodeByIndex(MyNode node, int idx){
        int i = 0;
        MyNode result = null;
        MyNode j = node;
        while(j != null){
            if(i == idx) {
                result = j;
                break;
            }
            i++;
            j = j.next;
        }
        return result;
    }

}
