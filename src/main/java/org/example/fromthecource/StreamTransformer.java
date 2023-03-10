package org.example.fromthecource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class StreamTransformer implements Transformable{

    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileIn);
        int i;
        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }


       /* StringBuilder result = new StringBuilder();
        try {
            FileInputStream  stream = new FileInputStream(fileIn);
            int r;
            do {
                 r= stream.read();
                result.append((char)r);
                } while (r!=-1);
            System.out.println(result.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
            fileOutputStream.write(fileIn.getBytes(StandardCharsets.UTF_8));
            //fileOutputStream.write(result.toString().getBytes(StandardCharsets.UTF_8),0, result.length());
           // fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
