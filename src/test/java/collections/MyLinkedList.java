package collections;

import java.util.LinkedList;

/**
 * @authon gm
 * @date 2019/3/29
 * @description 测试LinkedList
 */

//查询效率低，增删效率高，线程不安全
//当对象为null时，是不能使用对象的方法和属性，会报空指针。  //基础是指针（对象）
public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;

    private int size;



    //构造方法
    public MyLinkedList(){}

    //链表末尾添加
    public void add(E object){
        Node node = new Node(object);
        if (first == null){
            first = node;
            last = node;
        }
        else{
            node.previous = last;
            last.next = node;  //注意指针的妙用
            last = node;
        }
        size++;
    }

    //链表插入
    public void add(int index,E object){
        checkElementIndex(index);
        if(index == (size)){
            add(object);
        }
        else if(index == 0){
            Node x = new Node(object);
            first.previous = x;
            x.next = first;
            first = x;
        }
        else{
            Node x = new Node(object);
            Node node = node(index);
            x.previous = node.previous;
            x.next = node;
            node.previous.next = x;
            node.previous = x;
        }
        size++;
    }

    //获取第index个的node的element（内容）
    public E get(int index){
        Node<E> node = node(index);
        return node!=null? node.element : null;
}
    //获取LinkedList第index的node对象
    public Node<E> node(int index){
        checkElementIndex(index);
        if(checkHalfIndex(index)){
            Node<E> x = first;
            for(int i=0;i<index;i++){
                x = x.next;
            }
            return x;
        }
        else{
            Node<E> x = last;
            for(int i=size;i>index;i++){
                x = x.previous;
            }
            return x;
        }
    }

    //移除LinkedList中的元素
    public void remove(int index) {
        checkElementIndex(index);
        if (index == 0) {
            removeFirst();
            return;
        } else if (index == (size - 1)) {
            removeLast();
            return;
        }
        else{
            Node<E> x = node(index);
            Node<E> prev = x.previous;
            Node<E> next = x.next;

            prev.next = next;
            next.previous = prev;
        }
    }

    //移除LinkedList的第一个元素
    public void removeFirst(){
        if(size == 0){
            return;
        }
        else{
            Node<E> next = first.next;
            first.element = null;
            first.next = null;

            first = next;
            if(first == null){
                last= null;
            }
            else{
                next.previous = null;
            }
            size--;
        }
    }

    //移除末尾元素
    public void removeLast(){
        if(size == 0){
            return;
        }
        else{
            if(size == 1){
                first = null;
                last = null;
            }
            else{
                Node<E> node = last.previous;
                node.next = null;
            }
            size--;
        }
    }

    //检查index与size的一般大小关系
    public boolean checkHalfIndex(int index){
        if(index <= (size >> 1 )){
            return true;
        }
        else{
            return false;
        }
    }

    //索引不合法打印内容
    public String outOfBoundsMsg(int index) {
        return "索引" + index + "不合法";
    }

    //检查索引是否合法
    public void checkElementIndex(int index){
        if(index<0||index >= size-1){
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }


    //linkedList的toString方法
    @Override
    public String toString() {
        //遍历列表中的元素
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> temp = first;
        while( temp!= null){
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }


    //println默认是调用方法中的tostring方法
    public static void main(String[] args){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
//        myLinkedList.remove(1);
        myLinkedList.add(1,"d");
//        myLinkedList.get(3);
        System.out.println(myLinkedList);
    }
}
