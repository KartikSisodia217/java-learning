class Node{
    String data;
    Node next;

    Node (String data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList2 {

    Node head;
    // add to linked list - add first
    public void addFirst(String data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add to linked list - add last
    public void addLast(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //printlist
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("y");
        list.addLast("z");
        list.printList();

    }
}
