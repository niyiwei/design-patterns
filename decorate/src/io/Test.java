package io;

import java.io.*;

/**
 * @author panhaidong
 * @date 2018/10/25 08:02
 */
public class Test {
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./test.txt")));
            while ( (c = in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
