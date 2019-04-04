package JDBCTest;

/**
 * @authon gm
 * @date 2019/3/28
 * @description 转型 狗
 */
public class TSDog extends TSAnimals {
    @Override
    public void shout() {
        System.out.println("狗会叫");
        super.shout();
    }
    public void property(){
        System.out.println("狗吃骨头");
    }
}
