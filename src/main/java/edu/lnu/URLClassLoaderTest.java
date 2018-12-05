package edu.lnu;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javathinker.net/book/classes/");
            URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
            Class cl = classLoader.loadClass("Sample");
            System.out.println(cl.getClassLoader());
            Object obj = cl.newInstance();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
