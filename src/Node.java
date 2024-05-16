public class Node {
    Node next;
    int data;

    public Node(int data){
        this.data=data;
        next=null;
    }

    public Node(int data,Node nextNode){
        this.data=data;
        this.next=nextNode;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
