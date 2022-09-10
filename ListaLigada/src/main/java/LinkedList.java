

public class LinkedList<T> {
    Node head;

    public LinkedList() {
        this.head = new Node(null);

    }


    public void insertNode(T value){
      Node newNode = new Node<>(value);
      newNode.setNext(head.getNext());
      head.setNext(newNode);
    }

    public void showList(){
        Node current = head.getNext();
        while(current!=null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T searchNode(T value){
        Node current = head.getNext();
        while(current!=null){
            if(current.getValue()==value){
                return (T) current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean removeNode(T value){
        Node previousNode = head;
        Node currentNode = head.getNext();
        while(currentNode!=null){

            if(currentNode.getValue()==value){
                previousNode.setNext(currentNode.getNext()) ;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public int getLenght(){
        Node currentNode = head.getNext();
        int lenght = 0;
        while(currentNode!=null){
            currentNode = currentNode.getNext();
            lenght++;
        }
        return lenght;
    }
}
