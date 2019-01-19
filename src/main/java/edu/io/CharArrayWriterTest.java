package edu.io;


import java.io.CharArrayWriter;

public class CharArrayWriterTest {

    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write('你');
        writer.write('好');

        char[] buff = writer.toCharArray();
        System.out.println(new String(buff));

        writer.close();
}

}
