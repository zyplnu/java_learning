package edu.io;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderTest {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("abcd1 好");
        int data;
        while((data = reader.read()) != -1)
            System.out.println((char) data);
        reader.close();
    }
}
