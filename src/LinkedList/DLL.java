package LinkedList;

class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data=data;
    }
}
class LL{
    Node2 head;
    Node2 tail;
    public void add(int data){
        Node2 hello=new Node2(data);
        if(head==null){
            head=hello;
            tail=hello;
        }else{
            tail.next=hello;
            hello.prev=tail;
            tail=hello;
        }
    }
    public void dis1(){
        Node2 n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
    public void dis2(){
        Node2 n=tail;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.prev;
        }
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
            Node2 n=head;
            while (n.next.data!=tar) {
                n=n.next;
            }
            n.next=n.next.next;
            n.next.prev=n;
        }
    }
}
class DLL {
    public static void main(String[] args) {
        LL o=new LL();
        o.add(10);o.add(20);o.add(30);o.add(40);
        o.delete(30);
        o.dis1();
    }
}
