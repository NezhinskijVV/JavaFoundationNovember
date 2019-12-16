package collections.myLinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node<T> {
    private T value;
    private Node<T> prev;
    private Node<T> next;
}
