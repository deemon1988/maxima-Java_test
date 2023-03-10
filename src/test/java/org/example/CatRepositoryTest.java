package org.example;

import org.example.model.Cat;
import org.example.repository.CatRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class CatRepositoryTest {
    private CatRepository repo;

    @Before
    public void init() {
        repo = new SimpleCatRepository();
    }

    @Test
    public void shouldCRUDWorks() {

        Cat cat1 = new Cat("Мурзик", 5, true, 1L);
        Cat cat2 = new Cat("Барсик", 6, true, 2L);
        Cat cat3 = new Cat("Мурка", 8, false, 3L);
        Cat cat4 = new Cat("Aурка", 8, false, 4L);
        Cat cat5 = new Cat("Карл", 7, true, 5L);


        repo.create(cat1);
        repo.create(cat2);
        repo.create(cat3);              // создание 5 котов
        repo.create(cat4);
        repo.create(cat5);              // 1 переменную вместо 5

        // тест create()
        List<Cat> allCats = repo.findAll();        // тестирование findAll() - не проходит тест
        assertEquals(5, allCats.size());   // 5 котов

        // тест read()
        Cat testCat = repo.read(3L);
        // assertEquals("Барсик", testCat.getName());
        // assertEquals(5, testCat.getWeight());
        //  assertTrue(testCat.isAngry());
/*
        Cat newCat1 = new Cat(5L,"Карл III", 7, false);
        Cat newCat2 = new Cat(2L,"Рамзес", 3, true);

        repo.update(newCat1.getId(), newCat1);
        repo.update(newCat2.getId(), newCat2);

        testCat = repo.read(5L);
        assertEquals("Карл III", testCat.getName());
        assertEquals(7, testCat.getWeight());
        assertTrue(testCat.isAngry());

        //тестирование delete()
        repo.delete(1L);                // удаление кота
        testCat = repo.read(1L);        // чтение из репозитория
        assertNull(testCat);               // возвращает null - удален*/

       /* repo.delete(4L);
        allCats = repo.findAll(cats);
        assertEquals(3, cats.size());*/


    }
}
