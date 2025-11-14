package LLT;
class Node {
    float data;
    Node next;

    Node(float data) {
        this.data = data;
    }
}

class SLL {
    public static void main(String[] args) {
        Node head=new Node(10.2f);
        Node sec=new Node(10.2f);
        Node tail=new Node(10.3f);

        head.next=sec;
        sec.next=tail;
        tail.next=null;
        dis(head);
    }
    public static void dis(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
}
