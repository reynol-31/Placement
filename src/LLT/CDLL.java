package LLT;
class Node4{
    String data;
    Node4 next;
    Node4 prev;
    Node4(String data){
        this.data=data;
    }
}
class CDLL {
    public static void main(String[] args) {
        Node4 head=new Node4("A");
        Node4 sec=new Node4("B");
        Node4 four=new Node4("C");
        Node4 tail=new Node4("D"); 

        head.next=sec;
        sec.next=four;
        four.next=tail;
        tail.next=head;

        head.prev=tail;
        sec.prev=head;
        four.prev=sec;
        tail.prev=four;

        dis(head,tail);
    }
    public static void dis(Node4 head,Node4 tail){
        Node4 n=head;
        Node4 n1=tail;
        do{
            System.out.print(n.data+"->");
            n=n.next;
        }while(n!=head);
        System.out.println();
        do{
            System.out.print(n1.data+"->");
            n1=n1.prev;
        }while(n1!=tail);
    }
}
