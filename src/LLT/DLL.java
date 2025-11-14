package LLT;
class Node3{
    float data;
    Node3 next;
    Node3 prev;
    Node3(float data){
        this.data=data;
    }
}
class DLL {
    public static void main(String[] args) {
        Node3 head=new Node3(10.1f);
        Node3 sec=new Node3(10.2f);
        Node3 tail=new Node3(10.3f);

        head.next=sec;
        sec.next=tail;
        tail.next=null;

        head.prev=null;
        sec.prev=head;
        tail.prev=sec;

        dis(head,tail);
    }
    public static void dis(Node3 head,Node3 tail){
        for(Node3 i=head;i!=null;i=i.next){
            System.out.print(i.data+"->");
        }
        System.out.println();
        for(Node3 i=tail;i!=null;i=i.prev){
            System.out.print(i.data+"->");
        }
    }
}
