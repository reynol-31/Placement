package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class CSLL {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node sec=new Node(2);
        Node third=new Node(3);
        Node four=new Node(4);
        Node tail=new Node(5);

        head.next=sec;
        sec.next=third;
        third.next=four;
        four.next=tail;
        dis(head);
    }
    public static void dis(Node head){
        Node n=head;
        do{
            System.out.println(n.data+"->");
            n=n.next;
        }while(n!=head);
    }
}
