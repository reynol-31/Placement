package IMLL;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SLL {
    Node head;
    Node tail;
    SLL(){
        head=null;
        tail=null;
    }
    public void insert(int data){
        Node hello =new Node(data);
        if(head==null){
            head=hello;
            tail=hello;
        }else{
            tail.next=hello;
            tail=hello;
        }
    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println();
    }
    public void search(int data){
        int p=0;
        Node n=head;
        while(n!=head){
            if(n.data==data){
                p=1;
                break;
            }
            n=n.next;
        }
        if(p==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public void del(int val){
        if(head.data==val){
            head=head.next;
        }else{
            Node n=head;
            while(n.next!=null&&n.next.data!=val){
                n=n.next;
            }
            if (n.next!=null) {
                n.next=n.next.next;
            }
        }
    }
    public static void main(String[] args) {
        SLL o=new SLL();
        o.insert(10);
        o.insert(20);
        o.insert(30);
        o.insert(40);
        o.display();
        o.search(100);
        o.del(30);
        o.display();
    }
}
