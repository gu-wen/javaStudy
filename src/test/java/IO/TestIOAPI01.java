package IO;

import java.io.*;

/**
 * @authon gm
 * @date 2019/4/23
 * @description 测试IO outputstream
 */
public class TestIOAPI01 {
    //如果main函数中不添加变量就无法进行运行在idea中
    public static void main(String[] args){
        File src = new File("C:/Users/29641/Desktop/tesk.txt");
        OutputStream out = null;
        try {
            out = new FileOutputStream(src,true);
            String msg = "我是你爸爸";
            byte[] msgb = msg.getBytes();
            out.write(msgb,0,msgb.length);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!= null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
