package modifier;

/**
 * @authon gm
 * @date 2019/3/26
 * @description test public
 */

// @main方法总结：main方法是类运行入口，一个java文件可以存在多个类，
    // 但只能有一个public修饰的类，用javac 编译这个.java文件的时候，
    // 它会给每一个类生成一个.class文件
    // 运行java文件，程序回去寻找文件中public
    // 修饰的类中的main方法从而运行。

// @static https://stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context
    // 正确理解类与类实例的不同，被static修饰的方法或者常量，是所有实例对象
    // 都有的，其他的方法或者常量，只有当该类被实例化时，才会被？加载到内存？中
    // 类比汽车图纸和汽车，汽车图纸定义了汽车特性：run，但图纸是不会run
    // 只有汽车才会run
public class PublicModifier {
    public static void main(String[] args){
        //----------------------------------------------------

        // @main System.out.println("PublicModifier"); @main
        // @static PublicModifier instance1 = new PublicModifier();
        // @static instance1.staticTest();

        //----------------------------------------------------

        // @static public void staticTest(){
        // @static System.out.println("测试非static方法使用");
        // @static }

        //----------------------------------------------------

    }
    public void publicTest(){
        System.out.println("测试public方法");
    }
}


