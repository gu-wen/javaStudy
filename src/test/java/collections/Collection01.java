package collections;

/**
 * @authon gm
 * @date 2019/3/28
 * @description 提供容器
 */
public class Collection01 <E>{
    //-------------------------------
    //泛型不能使用new E() 不能使用new E[] 在静态环境下不允许类的参数是泛型类型
    //只能利用强转实现  泛型意义：避免类型判断、强转
    //异常类不能是泛型的  ***JVM中没有泛型***
    //https://www.cnblogs.com/diyishijian/p/5063998.html
    //http://www.cnblogs.com/tiancai/p/7449207.html
//    Object[] objectArray = new Object[5];
//
//    public void setObject(int index,E object){
//        objectArray[index] = object;
//    }
//
//    public E getObject(int index){
//        return (E) objectArray[index];
//    }
    //----------------------------------
}
