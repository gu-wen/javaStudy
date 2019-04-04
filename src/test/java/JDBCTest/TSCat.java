package JDBCTest;

/**
 * @authon gm
 * @date 2019/3/28
 * @description 转型猫
 */
public class TSCat extends TSAnimals{
    @Override
    public void shout() {
        super.shout();
        System.out.println("猫会叫");
    }

    public void property(){
        System.out.println("猫抓老鼠");
    }
}
