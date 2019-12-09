package collections;

public class MyLinkedList<T> {
    private Node<T> startNode;
    private Node<T> endNode;
    private int size = 0;

    public MyLinkedList(Node<T> startNode, Node<T> endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
    }

    public Node<T> get(int index) {
        Node currentNode;
        if (index == 0) {
            currentNode = startNode;
        } else if (index <= (size / 2)) {
            currentNode = startNode;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
        } else {
            currentNode = endNode;
            for (int i = 0; i < size - index - 1; i++) {
                currentNode = currentNode.getPrev();
            }
        }

        return currentNode;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, T value) {
        if (size == 0) {
            startNode = new Node<T>(value, null, null);
        } else if (size == 1) {
            endNode = new Node<T>(value, startNode, null);
            startNode.setNext(endNode);
        } else {
            Node<T> prev = get(index - 1);
            Node<T> next = get(index);
            Node<T> insertNode = new Node<T>(value, prev, next);
            prev.setNext(insertNode);
            next.setPrev(insertNode);
        }
        size++;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public void printList() {
        System.out.println("Print List");
        for (int i = 0; i < size; i++) {
            System.out.print(get(i).getValue() + " ");
        }
        System.out.println();
    }
}
