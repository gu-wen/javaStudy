package modifier;

import org.springframework.web.servlet.ModelAndView;

/**
 * @authon gm
 * @date 2019/3/27
 * @description 测试平台
 */


public class ModifierTest {
    public static void main(String[] args){
    //----------------------------------------------------
        // 同一包下的类实例化不需要引入,所有修饰符除了private剩下的对与其他类都是可见的
//        PublicModifier publicModifier = new PublicModifier();
//        publicModifier.publicTest();
//
//        DefaultModifier defaultModifier = new DefaultModifier();
//        defaultModifier.DefaultTest();
//
//        ProtectedModifier protectedModifier = new ProtectedModifier();
//        protectedModifier.ProtestedTest();
//
//        PrivateModifier privateModifier = new PrivateModifier();
//        privateModifier.PrivateTest();

    //----------------------------------------------------
        // 同类下对于实例，修饰符都可见
//        ModifierTest modifierTest = new ModifierTest();
//        modifierTest.publicTest();
//        modifierTest.DefaultTest();
//        modifierTest.ProtestedTest();
//        modifierTest.PrivateTest();
    // ----------------------------------------------------

    }

    //----------------------------------------------------
//    public void publicTest(){
//        System.out.println("测试public方法");
//    }
//
//    void DefaultTest(){
//        System.out.println("测试default方法");
//    }
//
//    protected void ProtestedTest(){
//        System.out.println("测试protested方法");
//    }
//
//    private void PrivateTest(){
//        System.out.println("测试Private方法");
//    }
    //----------------------------------------------------
}
