package collections.myLinkedList;

import collections.myLinkedList.MyLinkedList;

public class MyLinkedListRunner {
    public static void main(String[] args) {
//        Node<Integer> nodeStart = new Node<>();
//        Node<Integer> node2 = new Node<>();
//        node2.getValue();
//        Node<Integer> nodeEnd = new Node<>();
//        nodeStart.setNext(node2);
//        node2.setPrev(nodeStart);
//        node2.setNext(nodeEnd);
//        nodeEnd.setPrev(node2);
//
//        LinkedList linkedList = new LinkedList<>();
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(nodeStart, nodeEnd);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1,1);
        myLinkedList.printList();
        myLinkedList.add(1,2);
        myLinkedList.printList();
        myLinkedList.add(1,3);
        myLinkedList.printList();

    }
}
