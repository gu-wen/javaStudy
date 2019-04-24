package IO;

import java.io.*;

/**
 * @authon gm
 * @date 2019/4/23
 * @description 测试IO四大抽象类
 */
//数据分类：字符流(Reader、Writer)、字节流（InputStream、OutputStream）  流向分类：输入、输出  节点流（File、byte）、处理流
public class TestIOAPI {
    public static void main(String[] args){
        File src = new File("C:/Users/29641/Desktop/临时.txt");
        InputStream in = null;
        try {
            in = new FileInputStream(src);
            int temp;
            while((temp=in.read())!= -1){
                System.out.println((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
