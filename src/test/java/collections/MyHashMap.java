package collections;

/**
 * @authon gm
 * @date 2019/4/2
 * @description 测试Map
 */
public class MyHashMap<K,V> {
    NodeHash[] table;

    int size;

    NodeHash itemLast = null;
    public MyHashMap(){
        table = new NodeHash[16]; //长度是2的整数幂
    }

    public int myHash(int hashcode ,int length){
        return hashcode&(length - 1);
    }

    public void put(K key,V value){
        NodeHash<K,V> nodeHash = new NodeHash();
        nodeHash.key = key;
        nodeHash.value = value;
        nodeHash.next = null;
        nodeHash.hash = myHash(nodeHash.key.hashCode(),table.length);

        NodeHash temp = table[nodeHash.hash];

        if(temp == null){
            table[nodeHash.hash] = nodeHash;
        }else{
//            while(temp != null && temp.key != nodeHash.key){
//                temp = temp.next;
//            }
//            if (temp.key == nodeHash.key && temp == table[nodeHash.hash]){
//                table[nodeHash.hash].value = nodeHash.value;
//            }
//            else if(temp.key == nodeHash.key){
//                temp.value = nodeHash.value;
//            }
//            else if(temp == null){
//                temp.next = nodeHash;
//            }
            while(temp != null){
                if(temp.key == nodeHash.key){
                    temp.value = nodeHash.value;  //指针的妙用
                    nodeHash = null;
                    break;
                }
                else{
                    itemLast = temp;
                    temp = temp.next;
                }
            }
            if(nodeHash != null){
                itemLast.next = nodeHash;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i=0;i<table.length;i++){
            NodeHash temp = table[i];
            while(temp != null){
                sb.append( temp.key + ":" + temp.value);
                temp = temp.next;
            }
//            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public V get(Object key){
//        nodeHash.key = key;
        int hash = myHash(key.hashCode(),table.length);
        NodeHash<K,V> temp = table[hash];
        if(temp == null){
            return null;
        }
        else{
            while(temp != null){
                if(temp.key == key){
                    return temp.value;
                }
                else{
                    temp = temp.next;
                }
            }
            return null;
        }
    }

    public static void main(String[] args){
        MyHashMap<Integer,String> myHashMap = new MyHashMap();
        myHashMap.put(0,"one");
        myHashMap.put(20,"two");
        myHashMap.put(30,"three");
        myHashMap.put(17,"four");
        myHashMap.put(4,"five");
//        System.out.println(myHashMap);
        Object object = myHashMap.get(0);
        System.out.println(object == null?null:object.toString());
    }


}
