package IO;

/**
 * @authon gm
 * @date 2019/4/23
 * @description 测试ioAPI 编码问题
 */
public class TestFileAPI03 {
    public static void main(String[] args) throws Exception{
        String msg = "我是爸爸";
        //字节数组
        byte[] data = msg.getBytes(); //默认使用工程的字符集

        String msg1 = new String(data,0,data.length,"utf-8");

        System.out.println(msg1);
    }
}
