public class MysingleLinkedList {

    Node head;

    int count;


    public void add(int data){

        Node node= new Node(data);
        Node current= head;

        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(node);
    }
    public static void main(String[] args) {


    }
}
