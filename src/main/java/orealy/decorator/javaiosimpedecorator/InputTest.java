package orealy.decorator.javaiosimpedecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int charts;

        try(InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                new FileInputStream("C:\\netcracker\\SVN\\patterns\\src\\main\\java\\headfirstpatterns\\decorator\\javaiosimpedecorator\\test.txt")))){
            while ((charts = inputStream.read()) >= 0){
                System.out.print((char) charts);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
