package org.example;

import org.example.frombook.Gen;
import org.example.frombook.TwoGen;

public class GenDemo {

    public static void main(String[] args) {
        // Создать обобщенную ссылку на целочисленное значение
        Gen<Integer> iOb;           // ◄------------------- Создание ссылки на объект типа Gen<Integer>
        // Создать объект типа Gen<Integer> и присвоить ссылку
        // на него переменной iOb. Обратите внимание на
        // автоупаковку при инкапсуляции значения 88 в объекте
        // типа Integer.
        iOb = new Gen<Integer>(88); //◄------------------- Создание экземпляра типа Gen<Integer>
        // Отобразить тип данных, используемых в объекте iOb
        iOb.showType();
        // Получить значения из объекта iOb. Обратите внимание
        // на то, что приведение типов здесь не требуется,
        int v = iOb.getOb();
        System.out.println("значение: " + v);
        System.out.println();
        //Создание ссылки и объекта типа Gen<String>
        // Создать объект типа Gen для строк
        Gen<String> strOb = new Gen<String>("Тестирование обобщений");
        // Отобразить тип данных, используемых в объекте strOb
        strOb.showType();
        // Получить значение из объекта strOb. Заметьте,
        // что приведение типов здесь также не требуется.
        String str = strOb.getOb();
        System.out.println("значение: " + str);

        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
        tgObj.showTypes();
        int t = tgObj.getOb1();
        System.out.println("значение: " + t);
        String strV = tgObj.getOb2();
        System.out.println("значение: " + strV);
    }


}

