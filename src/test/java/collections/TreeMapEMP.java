package collections;

/**
 * @authon gm
 * @date 2019/4/8
 * @description 测试自定义对象的keyset
 */
public class TreeMapEMP implements Comparable<TreeMapEMP>{
    int id;
    int age;
    String name;

    public TreeMapEMP(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return(this.id + " " + this.age + " " + this.name);
    }

    //负数：小于 0：等于 整数：大于
    @Override
    public int compareTo(TreeMapEMP o) {
        if(this.age< o.age){
            return -1;
        }
        else if(this.age>o.age){
            return 1;
        }else{
            if(this.id>o.id){
                return 1;
            }
            else if(this.id < o.id){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}