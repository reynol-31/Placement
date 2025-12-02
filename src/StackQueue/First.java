package StackQueue;
class Main{
    public static void main(String[] args) {
        Stack o=new Stack(3);
        o.push(10);
        o.push(20);
        o.push(30);
        o.dis();
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}