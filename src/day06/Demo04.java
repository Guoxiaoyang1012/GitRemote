package day06;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
File:文件、目录相关的操作
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\IdeaProjects\\LearnJava42\\src\\day06\\test.txt");
        //判断磁盘上是否存在文件。存在返回true，不存在返回false
        System.out.println(file.isFile());

        if(!file.isFile()){
            //创建文件
            boolean bool = file.createNewFile();
            System.out.println("创建文件：" + bool);
        }

        System.out.println("文件是否存在：" + file.isFile());
        System.out.println("文件的大小：" + file.length());

        //System.out.println("文件的最后修改时间:" + file.lastModified());
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println("文件的最后修改时间:" + sdf.format(date));

        System.out.println("文件的名字：" + file.getName());

        boolean bool = file.delete();
        System.out.println("删除文件：" + bool);
        System.out.println("=============================================");

        File path = new File("E:\\IdeaProjects\\LearnJava42\\src\\day06");
        //判断磁盘上是否存在目录。存在返回true，不存在返回false
        System.out.println("磁盘上是否存在目录：" + path.isDirectory());

        if(path.isDirectory()){
            //目录下的子目录、文件列出来
            String[] files = path.list();
            for(String f : files){
                System.out.println(f);//获取子目录的名字
            }
            File[] fs = path.listFiles();
            for(File f : fs){
                System.out.println(f.getName());//获取子目录的名字
                System.out.println(f.getAbsoluteFile());//获取子目录的路径
            }
        }

        File path2 = new File("E:\\IdeaProjects\\LearnJava42\\src\\day06\\aa");
        System.out.println("磁盘上是否存在目录：" + path2.isDirectory());//false

        if(!path2.isDirectory()){
            boolean bool2 = path2.mkdir();
            System.out.println("创建目录：" + bool2);
        }
        System.out.println("删除目录：" + path2.delete());

    }
}
