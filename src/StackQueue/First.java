package StackQueue;
class Main{
    public static void main(String[] args) {
        Stack o=new Stack(3);
        o.push(10);
        o.push(20);
        o.push(30);
        o.pop();
        o.dis();
        o.peek();
    }
}
class Stack {
    int arr[];
    int top;
    Stack(int size){
        arr=new int[size];
        top=-1;
    }
    public void push(int data){
        if(top==arr.length-1)
            System.out.println("Overflow");
        else
            arr[++top]=data;
    }
    public void dis(){
        if(top==-1)
            System.out.println("Empty Stack");
        else
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
    }
    public void peek(){
        if(top==-1)
            System.out.println("Empty Stack");
        else
            System.out.println(arr[top]);
    }
    public void pop(){
        if(top==-1)
            System.out.println("Empty Stack");
        else
            top--;
    }
}