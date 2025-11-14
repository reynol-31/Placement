package LLT;
class Node1 {
    String data;
    Node1 next;
    Node1(String data){
        this.data=data;
    }
}
class CLL {
    public static void main(String[] args) {
        Node1 head=new Node1("A");
        Node1 sec=new Node1("B");
        Node1 third=new Node1("C");
        Node1 tail=new Node1("D");

        head.next=sec;
        sec.next=third;
        third.next=tail;
        tail.next=head;
        dis(head);
    }
    public static void dis(Node1 head){
        Node1 n=head;
        do{
            System.out.print(n.data+"->");
            n=n.next;
        }while(n!=head);
    }
}
