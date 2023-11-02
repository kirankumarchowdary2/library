class Stack{
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Stack(){
        this.head=null;
    }
    void push(int val){
        Node top=new Node(val);
        top.next=head;
        head=top;
    }
    void pop(){
        if(head==null){
            System.out.println("stack is Empty");
        }else{
        int val=head.data;
        System.out.println(val);
        head=head.next;
        }
    }
    void peek(){
        if(head==null){
            System.out.println("stack is empty");
        }else{
            System.out.println(head.data);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.pop();
        s.push(100);
        s.peek();
        s.push(1000);
        s.peek();
        s.pop();
        s.pop();
        s.push(1);
    }
}