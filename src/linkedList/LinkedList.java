package linkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;

        public void addFirst(int data) {
            //step-1 Create a new Node
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            //step-2 newNode = head
            newNode.next = head; //link

            //step-3 head=newNode
            head = newNode;
        }

        public void addLast(int data){
            //step-1 create a new node
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            //step-2 tail.next = newNode
            tail.next=newNode;

            //step-3 tail->newNode
            tail=newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");

        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addFirst(2);
            ll.addLast(7);
            ll.print();
        }

}


