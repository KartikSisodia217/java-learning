import java.sql.SQLOutput;

public class Stack_LL {
    static class Node{
        int Data;
        Node Next;

        Node (int Data){
            this.Data = Data;
            this.Next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push (int data){
            Node newNode = new Node (data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.Next = head;
            head = newNode;
        }
        public static int pop (){
            if(isEmpty()){
                return -1;
            }
            int top = head.Data;
            head = head.Next;
            return top;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.Data;
        }

    }
    public static void main (String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }

}
