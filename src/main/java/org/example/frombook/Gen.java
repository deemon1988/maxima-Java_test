package org.example.frombook;

import lombok.Getter;


public class Gen<T> {                   //  В объявлении этого класса Т означает обобщенный тип
    T ob; // объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т
    public Gen(T o) {
        ob = o;
    }

    // Вернуть объект ob из метода
    public T getOb() {
        return ob;
    }

    // Отобразить тип Т
    public void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }

}

