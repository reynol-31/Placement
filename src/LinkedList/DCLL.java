package LinkedList;

class Node3{
    int data;
    Node3 next;
    Node3 prev;
    Node3(int data){
        this.data=data;
    }
}
class LL{
    Node3 head;
    Node3 tail;
    public void add(int data){
        Node3 hello=new Node3(data);
        if(head==null){
            head=hello;
            tail=hello;
            tail.next=head;
            head.prev=tail;
        }else{
            tail.next=hello;
            hello.prev=tail;
            tail=hello;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void dis1(){
        Node3 n=head;
        do{
            System.out.print(n.data+"->");
            n=n.next;
        }while(n!=head);
    }
    public void dis2(){
        Node3 n=tail;
        do{
            System.out.print(n.data+"->");
            n=n.prev;
        }while(n!=null);
    }
    public void delete(int tar){
        if(head.data==tar){
            head=head.next;
            head.prev=null;
        }else if(tail.data==tar){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            Node3 n=head;
            while (n.next.data!=tar) {
                n=n.next;
            }
            n.next=n.next.next;
            n.next.prev=n;
        }
    }
}
class DCLL {
    public static void main(String[] args) {
        LL o=new LL();
        o.add(10);o.add(20);o.add(30);o.add(40);
        o.delete(30);
        o.dis1();
    }
}
