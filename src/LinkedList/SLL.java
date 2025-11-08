package LinkedList;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
    }
}
class Main{
    public static void main(String[] args) {
        Node head=new Node("Mister A");
        Node sec=new Node("Mister B");
        Node third=new Node("Mister c");
        Node tail=new Node("Mister D");

        head.next=sec;
        sec.next=third;
        third.next=tail;
        tail.next=null;
        dis(head);
    }
    public static void dis(Node head){
        Node n=head;
        while (n!=null) {
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
}