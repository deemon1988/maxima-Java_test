package org.example;

import org.example.model.Cat;
import org.example.repository.BaseRepository;
import org.example.repository.CatRepository;
import org.example.repository.SimpleCatRepository;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class App2 {
    private static BaseRepository<Cat, Long> baseRepository;
    // private static CatRepository catRepository;
    //public static final String DB_URL = "jdbc:h2:mem:test";   // тестовый сервер
   // public static final String DB_DRIVER = "org.h2.Driver";

    public static void main(String[] args) throws Exception {
        Cat murzik = new Cat("Мурзик", 5, true, 1L);
        Cat barsik = new Cat("Барсик", 6, true, 2L);
        Cat murka = new Cat("Мурка", 8, false, 3L);
        Cat aurka = new Cat("Aурка", 8, false, 4L);


        String propertiesPath =Thread.currentThread().getContextClassLoader().getResource("H2CatRepository.properties").getPath();
        Properties dbProps = new Properties();
        dbProps.load(new FileInputStream(propertiesPath));
        String dbUrl = dbProps.getProperty("db.url");

        baseRepository = new SimpleCatRepository("cats", dbUrl);

        baseRepository.create(barsik);
        baseRepository.read(2L);
        baseRepository.update(2L, murka);
        baseRepository.delete(3L);
        baseRepository.findAll();

       /* try {

            Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("Соединение с БД выполнено");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE cats (Name VARCHAR(45), Weight INT, isAngry BOOLEAN, id INT)");
            statement.executeUpdate((String.format("INSERT INTO cats(name, weight, isAngry, id) VALUES ('%s', %d,'%s', %d)"
                    , murzik.getName(), murzik.getWeight(), murzik.isAngry(), murzik.getId())));
            // statement.executeUpdate("ALTER TABLE catTable ADD FOREIGN KEY (NAME) REFERENCES murzik(name)");
            ResultSet result = statement.executeQuery("SELECT * FROM cats");
            while (result.next()) {
                String name = result.getString("name");
                int weight = result.getInt("weight");
                boolean isAngry = result.getBoolean("isAngry");
                long id = result.getLong("id");
                System.out.println(name + " " + weight + " " + isAngry + " " + id);
            }
            connection.close();
            System.out.println("Отключение от БД выполнено");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Нет драйвера БД !!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL !!");
        }*/

    }
}

