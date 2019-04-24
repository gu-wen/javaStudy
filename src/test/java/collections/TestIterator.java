package collections;

import java.util.*;

/**
 * @authon gm
 * @date 2019/4/8
 * @description 使用迭代器遍历容器
 */
public class TestIterator {
    public static void main(String[] args){
        TestIterator testIterator = new TestIterator();
//        testIterator.testList();
        testIterator.testMap();
    }

    public void testList(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");
        for (Iterator<String> item = list.iterator();item.hasNext();){
            String temp = item.next();
            System.out.println(temp);
        }
    }

    public void testMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"3");
        map.put(2,"2");
        map.put(1,"1");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Iterator<Map.Entry<Integer,String>> item = set.iterator();item.hasNext();){
            Map.Entry temp = item.next();
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }
}
