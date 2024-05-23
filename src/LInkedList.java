public class LInkedList  {

    Node head;
    int count;

//    public LInkedList(){
//        head=null;
//        count=0;
//    }

    public LInkedList(Node newHead) {
        this.head = newHead;
      count++;
    }

    public void add(int newData){
        Node temp = new Node(newData);
        Node current =head;
        while (current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public int getIndex(int index){
        Node current=head;
     for(int i=0; i<index; i++){
         current= current.getNext();
     }
       return current.getData();
    }



   public int getSize(){
        return count;
   }

   public void addValue(int newData){
        Node current = new Node(newData);
        current= head;
        if(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(current);
   }

   public boolean isEmpty(){
        return head==null;
   }

   public void remove(){
        Node current = head;

        if(current.getNext()==null){
            current=null;
        }else {
            System.out.println("Node is empty");
        }

       while(current.getNext().getNext()!=null){
           current=current.getNext();
       }
       current.setNext(null);
        count--;

   }
}
