package Lab03.Test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1、	编程实现读取并输出指定文件的内容，文件名由命令行给出且为绝对路径名。
public class FileTest01 {
            //读写文件有两种方式
            //1、字符读写流
            //2、字节读写流
            public static void main(String[] args) {
                //字符流方式读写txt文件
                //reader，writer
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(
                            new FileReader("D:\\test.txt")
                    );
                    String line = null;
                    while (
                            (line = reader.readLine())!=null
                    ){
                        System.out.println(line);
                    }
                    /*reader.readLine();*/
                    /*String line = reader.readLi*//*ne();*/
                    /*System.out.println(line);*/
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally{
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
    }
