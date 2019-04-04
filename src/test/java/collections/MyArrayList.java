package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @authon gm
 * @date 2019/3/28
 * @description MyArrayList 测试
 */

//StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
//由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类
//然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
//底层是数组 查询高、改变低、线程不安全
//功能点：1.get、set,2.插入、删除、添加3.扩容

public class MyArrayList<E> {
    private Object[] elementData;
    private int size;
    static private int DEFAULT_CAPACITY = 10;

    public static void main(String[] args) {
//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        for(int i=0;i<200;i++){
//            myArrayList.add(" "+i);
//        }
//        myArrayList.add(1,"插入");
//        System.out.println(myArrayList.toString());
    }

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        elementData = new Object[size];
    }

    //构造函数
    public MyArrayList(E[] object) {
        elementData = object;
    }

    public void add(E object) {
        if(size>elementData.length-1){
            grow(elementData.length);
        }
        elementData[size++] = object;
    }

    public void add(int index,E object){
        if(size>elementData.length-1){
            grow(elementData.length);
        }
        System.arraycopy(elementData,index,elementData,index+1,size - index );
        size++;
        elementData[index] = object;
    }

    @Override //重写tostring方法
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']'); //元素替换
        return sb.toString();
    }

    public E get(int index) {
        checkRange(index);
        return (E) elementData[index];
    }

    public void set(int index, E object) {
        elementData[index] = object;
    }

    public String outOfBoundsMsg(int index) {
        return "索引" + index + "超过了当前定义MyArrayList的长度：" + size;
    }

    public void checkRange(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    public void remove(int index) {
        checkRange(index);
        int rest = size - index - 1;
        if (rest == 0) {
            elementData[index] = null;
        } else {
            System.arraycopy(elementData, index + 1, elementData, index, rest);
        }
    }

    public void grow(int index){
        int oldCapacity = index;
        int newCapacity = oldCapacity + (oldCapacity >> 1); //加法运算符优先级大于移位运算符

        elementData = Arrays.copyOf(elementData,newCapacity);//原数组，新长度，返回数组
    }
}
