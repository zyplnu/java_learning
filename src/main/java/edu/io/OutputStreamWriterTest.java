package edu.io;

import java.io.*;

public class OutputStreamWriterTest {

    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/test.txt") , "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        char c = '好';
        osw.write(c);
        osw.close();
    }

}
