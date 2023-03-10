package org.example;

import org.example.model.Cat;
import org.example.repository.BaseRepository;

import java.io.FileInputStream;
import java.util.Properties;

public class App_7_module {
    private static BaseRepository<Cat, Long> baseRepository;
    public static void main(String[] args) throws Exception {
        Cat murzik = new Cat("Мурзик", 5, true, 1L);
        Cat barsik = new Cat("Барсик", 6, true, 2L);
        Cat murka = new Cat("Мурка", 8, false, 3L);
        Cat aurka = new Cat("Aурка", 8, false, 4L);


        String propertiesPath =Thread.currentThread().getContextClassLoader().getResource("H2CatRepository.properties").getPath();
        Properties dbProps = new Properties();
        dbProps.load(new FileInputStream(propertiesPath));
        String dbUrl = dbProps.getProperty("db.url");



      /*  String propertiesPath = "application.properties";
        Properties dbProps = new Properties();
        dbProps.load(new FileInputStream(propertiesPath));
        String dbUrl = dbProps.getProperty("db.url");
        String dbDriver = dbProps.getProperty("db.driver");

        BaseRepository<Cat, Long> advancedCatRepository = new AdvancedCatRepository(dbDriver,dbUrl);
        advancedCatRepository.create(murzik);
        advancedCatRepository.create(barsik);
        advancedCatRepository.create(murka);
        advancedCatRepository.read(1L);
        advancedCatRepository.update(1L, barsik);
        advancedCatRepository.read(1L);
        advancedCatRepository.delete(2L);
        advancedCatRepository.findAll();*/




    }
}

