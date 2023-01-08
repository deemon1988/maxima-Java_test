package org.example.repository;

import java.util.List;
import java.util.Optional;

public interface BaseDaoRepository<T> {

    boolean save(T element);   // create
    T get(int id);          //read // может вернуть null (можно обернуть в Optional)
    void update(T element, String[] params);


     void delete(T element);

    List<T> getAll();
}
