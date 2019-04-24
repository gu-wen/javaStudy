package IO;

import java.io.File;

/**
 * @authon gm
 * @date 2019/4/22
 * @description 测试file的api
 */

//类中为什么能创建对象却不能调用对象方法

public class TestFileAPI {
    public static void main(String[] args) throws Exception{
        File testFile = new File("C:/Users/29641/Desktop/临时.txt");
        String filename = testFile.getName();
        String filepath = testFile.getPath();
        String fileabsolutepath = testFile.getAbsolutePath();
//        System.out.println("文件名" + filename + "创建时所写的文件路径" + filepath + "文件的绝对路径" + fileabsolutepath);
        boolean isexists = testFile.exists();
        boolean isfile = testFile.isFile();
        boolean isdirectory = testFile.isDirectory();
        long filelength = testFile.length();
//        System.out.println("文件是否存在" + isexists + "是文件还是文件夹" + isdirectory + isfile + "如果是文件，文件大小为" + filelength);
        File test = new File("C:/Users/29641/Desktop/test.txt");
//        if(!test.exists()){
//            test.createNewFile();
//        }else{
//            System.out.println("文件夹已经存在");
//        }
        test.delete();  //并不进入到回收站中，直接删除
    }
}
