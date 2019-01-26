package edu.io;

import java.io.*;

public class OutputStreamWriterTest {

    private void readFile(String fileName) throws IOException {
        readFile(fileName , null);
    }

    private void readFile(String fileName , String charsetName) throws IOException {
        InputStream is = new FileInputStream(fileName);
        InputStreamReader isr;
        if(charsetName != null){
            isr = new InputStreamReader(is , charsetName);
        }else {
            isr = new InputStreamReader(is);
        }
        BufferedReader br = new BufferedReader(isr);
        String data;
        while((data = br.readLine()) != null){
            System.out.println(data);
        }
        br.close();
    }

    private void copyFile(String from , String fromCharset , String to , String toCharset) throws IOException {
        InputStream is = new FileInputStream(from);
        InputStreamReader isr;
        if(fromCharset != null){
            isr = new InputStreamReader(is , fromCharset);
        }else {
            isr = new InputStreamReader(is);
        }
        BufferedReader br = new BufferedReader(isr);


        OutputStream os = new FileOutputStream(to);
        OutputStreamWriter osw = new OutputStreamWriter(os , toCharset);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw , true);

        String data;
        while((data = br.readLine()) != null){
            pw.println(data);
        }
        br.close();
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        OutputStreamWriterTest test = new OutputStreamWriterTest();
        test.readFile("D:/test.txt" +
                "");
        test.copyFile("D:/test.txt" , null , "D:/out.txt" , "UTF-8");
        test.readFile("D:/out.txt");
        test.readFile("D:/out.txt" , "GBK");
    }

}
