public class StacksInLinkedList{

    static class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
            next = null ;
        }

    }

    public static Node head = new Node(0);

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int num){
        Node newStack = new Node(num); 
        if (isEmpty()){
            head = newStack ;
            return;
        }

        newStack.next = head ;
        head = newStack ;

    }

    public Object pop(){
        if (isEmpty()){
            return -1 ;
        }

       int top = head.data ;
       head = head.next ;
       return top ;
    }

    public Object peek(){
        if (isEmpty()){
            return -1 ;
        }

        return head.data;
    }

    public static void main(String[] args) {
        StacksInLinkedList stacks = new StacksInLinkedList();
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);

        while (!stacks.isEmpty()){
            System.out.println(stacks.peek());
            stacks.pop();
        }
    }
}
