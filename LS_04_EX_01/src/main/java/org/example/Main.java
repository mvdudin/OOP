import org.GBLinkedList.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addHead(2);
        list.addHead(1);
        list.addHead(0);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        System.out.println(list.length());

        System.out.println(list.getValue(3));
        System.out.println(list.getValue(5));
        System.out.println(list.getValue(2));
        System.out.println(list.getValue(0));

        System.out.println(list);

        MyLinkedList<String> list2 = new MyLinkedList<>();

        list2.addHead("ab");
        list2.addHead("bc");
        list2.addHead("cd");
        list2.addTail("fg");
        list2.addTail("gh");
        list2.addTail("hj");

        System.out.println(list2.length());

        System.out.println(list2.getValue(3));
        System.out.println(list2.getValue(5));
        System.out.println(list2.getValue(2));
        System.out.println(list2.getValue(0));

        System.out.println(list2);
    }
}
