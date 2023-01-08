package org.example.repository;

import org.example.model.Cat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleCatRepository implements CatRepository {
                                                              // имя таблицы задать в конструкторе
    public static final String DB_URL = "jdbc:h2:mem:test";   // задать в конструкторе
    public static final String DB_DRIVER = "org.h2.Driver";


    @Override
    public boolean create(Cat element) {
        try {
            Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("Соединение с БД выполнено");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE cats (Name VARCHAR(45), Weight INT, isAngry BOOLEAN, id INT)");
            statement.executeUpdate((String.format("INSERT INTO cats(name, weight, isAngry, id) VALUES ('%s', %d,'%s', %d)"
                    , element.getName(), element.getWeight(), element.isAngry(), element.getId())));
            // statement.executeUpdate("ALTER TABLE catTable ADD FOREIGN KEY (NAME) REFERENCES murzik(name)");
            ResultSet result = statement.executeQuery("SELECT * FROM cats");
            int row = 0;
            while (result.next()) {
                String name = result.getString("name");
                int weight = result.getInt("weight");
                boolean isAngry = result.getBoolean("isAngry");
                long id = result.getLong("id");
                System.out.println(name + " " + weight + " " + isAngry + " " + id);
                row = result.getRow();
                System.out.println("Записей обновлено: " + row);

            }

            System.out.println("Записей обновлено: " + row);
            if (row > 0) return true;
            connection.close();
            System.out.println("Отключение от БД выполнено");
        }
catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Нет драйвера БД !!");
            } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL !!");

        }

        return false;
    }

    @Override
    public Cat read(Long id) {
        return null;
    }

    @Override
    public int update(Long id, Cat element) {

        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Cat> findAll() {
        return null;
    }
}
