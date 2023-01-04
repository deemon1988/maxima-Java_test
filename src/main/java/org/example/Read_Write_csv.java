package org.example;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class Read_Write_csv {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("cat.csv");
        File csvFile = new File(path.toUri());
        if (csvFile.isFile()) {
            System.out.println("isFile");
        }
            // create BufferedReader and read data from csv
        BufferedReader csvReader = new BufferedReader(new FileReader("cat.csv"));
      String row;
        while ((row = csvReader.readLine()) != null) {
           String[] data = row.split(";");
            // do something with the data
            System.out.println(Arrays.toString(data));
        }
        csvReader.close();

        List<List<String>> rows = Arrays.asList(
                Arrays.asList("Jean", "author", "Java"),
                Arrays.asList("David", "editor", "Python"),
                Arrays.asList("Scott", "editor", "Node.js")
        );
        System.out.println(rows);

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Role");
        csvWriter.append(",");
        csvWriter.append("Topic");
        csvWriter.append("\n");

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();



    }

}
