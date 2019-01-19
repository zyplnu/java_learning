package edu.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {

    public static void main(String[] args) throws IOException {
        char[] buff = new char[]{'a','你','好','1'};
        CharArrayReader reader = new CharArrayReader(buff);
        int data;
        while((data = reader.read()) != -1){
            System.out.println(data);
        }
        reader.close();
    }

}
