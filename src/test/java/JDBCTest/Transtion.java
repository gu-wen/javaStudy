package JDBCTest;

/**
 * @authon gm
 * @date 2019/3/28
 * @description 测试转型
 */
public class Transtion {
    public static void main(String[] args){
        //----------------------------
        //*********继承和包的机制是否一样*********
//        Transtion transtion = new Transtion();
//        TSAnimals animals = new TSAnimals();
//        TSCat cat = new TSCat();
//        TSDog dog = new TSDog();
      //  dog.shout();  //测试super是否必须放在重写方法第一句，结论不是。

      //  TSAnimals animals1 = new TSCat();
      //  animals1.property(); //此处会报错，因为对于编译器来讲animals1 是TSAnimals对象
      //  ((TSCat) animals1).property(); //正确做法必须先强制转型。


        //所谓需要转型只不过是编译器编译不过，其本质没有发生变化，都是等号右边的东西。
//        TSAnimals animals2 = cat;
//        ((TSCat) animals2).property();
//
//        TSCat cat1 = (TSCat) animals;
//        cat1.property();
        //---------------------------
//    String string1 = "字符串";
//    Integer integer1 = 123;
//    Object object1 = new Object();
//
//    //对于编译器来讲 object2是Object对象 而非Integer对象
//    Object object2 = new Integer(1);
//    Integer integer2 = (Integer) object2;
//
//    //向上转型
//    Object objectT1 = string1;
//    Object objectT2 = integer1;
//    //向下转型
//    String stringT1 = (String) object1;
//    Integer integerT1 = (Integer) object1;
        //-----------------------------

        //重载方法名字相同，参数不同
        //多态 多态就是同一个接口，使用不同的实例而执行不同操作
        //重写 对父类方法进行重写
    }
}
