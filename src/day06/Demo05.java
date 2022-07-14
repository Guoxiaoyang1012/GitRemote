package day06;

import java.io.*;

/*
文件的读写：
    Java中文件的读写有40+类
    按字节读写：一次读写一个字节，FileInputStream(读)、FileOutputStream(写)
    按字符读写：一次读写一个字符(2个字节)，InputStreamReader(读)、FileReader(读)、BufferedReader(读)
                                         OutputStreamWriter(写)、FileWriter(写)、BufferedWriter(写)
     读写文件的流程：
     1、创建一个对象，比如FileInputStream类型的对象
     2、用read或writer去读/写文件
     3、关闭文件对象

     BufferedReader、BufferedWriter
 */
public class Demo05 {

    //读文件，将文件内容打印出来
    public static void readFile(String file) throws IOException {

        //需要Reader类型的参数，Reader是抽象类，不能实例化，用Reader的子类来实例化
        FileReader fr = new FileReader(file);
        //调用BufferedReader的构造方法创建对象
        BufferedReader br = new BufferedReader(fr);
        //读文件，读取一个字符
        int c = br.read();
        while(c != -1){//-1表示到达文件的末尾
            System.out.print((char) c);//整数转成字符
            c = br.read();//继续读下一个字符
        }
        //System.out.println(c);
        br.close();//关闭文件对象
        fr.close();//关闭文件对象
    }

    //读文件，将文件内容打印出来
    public static void readFile1(String file) throws IOException {

        //需要Reader类型的参数，Reader是抽象类，不能实例化，用Reader的子类来实例化
        FileReader fr = new FileReader(file);
        //调用BufferedReader的构造方法创建对象
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();//读取一行不包括换行符
        while(line != null){ //表示到达文件的末尾
            System.out.println(line);
            line = br.readLine();//读取下一行
        }
        br.close();
        fr.close();
    }

    public static void writerFile(String file, String content) throws IOException {
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(content);
        fw.close();
        System.out.println("写文件完成!");

    }

    public static void main(String[] args) throws IOException {
        readFile("E:\\IdeaProjects\\LearnJava42\\src\\day06\\Demo01.java");
        readFile1("E:\\IdeaProjects\\LearnJava42\\src\\day06\\Demo01.java");

        String content = "床前明月光，疑似地上霜。\n举头望明月，低头思故乡。";
        writerFile("E:\\IdeaProjects\\LearnJava42\\src\\day06\\test.txt", content);
    }

}
