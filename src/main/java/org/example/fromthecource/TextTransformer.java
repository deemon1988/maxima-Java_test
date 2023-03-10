package org.example.fromthecource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TextTransformer implements Transformable {


    @Override
    public void transform(String fileIn, String fileOut) throws IOException {

        String textOut = "<Сердитый (Дружелюбный)>кот<Имя>весом<n>кг.";
       /* String name;
        int weight;
        boolean isAngry;*/
        FileReader reader = new FileReader(fileIn);
        int c;
        int counter = 0;
        String text = new String();
        while ((c= reader.read())!=-1) {
            counter++;
            System.out.print((char) c);
            text += String.valueOf((char)c);
        }
        System.out.println();

        String[] row_csv = text.split(";");
        String[] row_txt = new String[row_csv.length];
        String isAngry=new String();
        String name = new String();
        String weight=new String();

        for (String index: row_csv) {
            if(index.equals("false") || index.equals("true")) {
                isAngry=index;
                int i;
                i= Arrays.binarySearch(row_csv, isAngry);
                row_txt[i] = isAngry;
            }

            try {
                int age_int ;
                age_int = Integer.parseInt(index);
                weight = String.valueOf(age_int);
                if (weight.equals(index)) {
                    int i;
                    i=Arrays.binarySearch(row_csv, weight);
                    row_txt[i] = weight;
                }

            }
            catch (NumberFormatException e) {
               // e.printStackTrace();
            }
        }

        for (int i=0; i<row_csv.length; i++){
            if(row_txt[i]==null){
                name=row_csv[i];
            }
        }

        reader.close();

        if(isAngry.equals("true")){
            textOut = textOut.replace("<Сердитый (Дружелюбный)>","Сердитый ");
        }
        if(isAngry.equals("false")){
            textOut = textOut.replace("<Сердитый (Дружелюбный)>","Дружелюбный ");
        }

        textOut = textOut.replace("<Имя>"," "+name+" ");
        textOut = textOut.replace("<n>"," "+weight+" ");
        System.out.println(textOut);

        FileWriter writer = new FileWriter(fileOut);
        writer.write(textOut);
        // writer.append('\n');
        writer.flush();
        writer.close();
    }
    }

