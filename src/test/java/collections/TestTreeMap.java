package collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @authon gm
 * @date 2019/4/8
 * @description 测试 treemap
 */
public class TestTreeMap {
    public static void main(String[] args){
//        Map<Integer,String> treeMap1 = new TreeMap<>();
//        treeMap1.put(20,"aa");
//        treeMap1.put(2,"ba");
//        treeMap1.put(30,"ca");
//
//        for(Integer key:treeMap1.keySet()){
//            System.out.println(key);
//        }
        Map<TreeMapEMP,String> treeMap2 = new TreeMap<>();
        treeMap2.put(new TreeMapEMP(20,18,"陈一"),"这是陈一");
        treeMap2.put(new TreeMapEMP(18,15,"陈二"),"这是陈二");
        treeMap2.put(new TreeMapEMP(17,15,"陈三"),"这是陈三");

        for(TreeMapEMP emp:treeMap2.keySet()){
            System.out.println(emp);
        }
    }
}
