package edu.io;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("D:/test.txt");
        BufferedOutputStream outputStream = new BufferedOutputStream(out);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeBytes("双打和解放军");
        dataOutputStream.flush();

        InputStream in = new FileInputStream("D:/test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(in , "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = "";
        while((line = bufferedReader.readLine()) != null)
            System.out.println(line);
        bufferedReader.close();
    }
}
