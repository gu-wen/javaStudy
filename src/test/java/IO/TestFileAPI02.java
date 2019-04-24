package IO;

import java.io.File;

/**
 * @authon gm
 * @date 2019/4/22
 * @description 测试文件API
 */
public class TestFileAPI02 {
    public static void main(String[] args){
        File mkdir = new File("C:/Users/29641/Desktop/test");
//        boolean creator = mkdir.mkdir();
//        System.out.println("文件创建成功还是失败" + creator);
        String[] filelist = mkdir.list(); //返回子目录的文件夹名称和文件名称(包括文件的后缀)
//        for(String file:filelist){
//            System.out.println(file);
//        }
        File[] files = mkdir.listFiles();
//        for(File file:files){
//            System.out.println(file.getAbsolutePath());
//        }
        TestFileAPI02 testFileAPI02 = new TestFileAPI02();
        testFileAPI02.fileName(mkdir);
    }
//递归头（递归结束条件）递归体
    public void fileName(File name){
        if(name.isDirectory()){
            File[] filename = name.listFiles();
            for(File file:filename){
                fileName(file);
            }
        }else{
            System.out.println(name.getName());
        }
    }
}
