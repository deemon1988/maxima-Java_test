package org.example;

import jdk.jfr.BooleanFlag;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
//@AllArgsConstructor
@ToString

public class Train extends Transport implements Repairable{
    String id;
    int carriageCount;
    boolean isExpress;


    public Train(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }


    @Override
    float getPrice(City city) {
        return 0;
    }

    @Override
    public void startRepair() {

    }

    @Override
    public void finishRepair() {

    }

    @Override
    public boolean isRepairing() {
        return false;
    }
}
// Д.з. использовать аннотации Lombok для всех свойств, геттеров сеттеров, метода toString
// и конструктора со всеми аргументами