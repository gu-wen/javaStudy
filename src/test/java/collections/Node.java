package collections;

/**
 * @authon gm
 * @date 2019/3/29
 * @description 测试节点
 */
public class Node<E> {
    Node previous;
    Node next;
    E element;

    public Node(Node previous, Node next, E element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(E object){
        this.element = object;
    }
}
