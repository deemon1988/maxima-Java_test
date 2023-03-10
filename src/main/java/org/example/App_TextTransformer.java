package org.example;

import java.io.*;

public class App_TextTransformer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cat.csv");

       /* int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }*/

        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int j;

        while((j = bufferedInputStream.read())!= -1){

            System.out.print((char)j);
        }
    }
}
