public class app {

    public static void main(String[] args) {
        LinkedList<Integer>  linkedList = new LinkedList<Integer>();
        linkedList.insertNode(5);
        linkedList.insertNode(3);
        linkedList.insertNode(9);
        linkedList.insertNode(13);
        linkedList.insertNode(19);
        linkedList.showList();
        System.out.println("-----------------------");
        System.out.println(linkedList.getLenght());
        System.out.println(linkedList.removeNode(3));
        linkedList.showList();
        System.out.println(linkedList.getLenght());
    }
}
