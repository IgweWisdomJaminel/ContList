import java.util.LinkedList;

public class SingleLink {



    public static void main(String[] args) {
        LinkedList<String>linkedList= new LinkedList<>();
        linkedList.add("First");
        linkedList.add("second");
        linkedList.addLast("fifth");
        linkedList.add(3,"third");
        linkedList.add("Third");
        System.out.println(linkedList);

    }
}
