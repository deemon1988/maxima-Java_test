package org.example.model;

import org.example.fromthecource.Cat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")             // по умолчанию Bean - синглтон
@Primary
@PropertySource(value = "classpath:application.properties" , encoding = "UTF-8")  //src\main\resources прописать вручную
public class Manul implements Cat {

    @Value("${manul.name}")             // указание ч\з properties файл
    private String name ; // = "Мурзик";
    @Value("${manul.weight}")
    private int weight;  // = 10;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
