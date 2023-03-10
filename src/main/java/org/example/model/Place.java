package org.example.model;

import org.example.fromthecource.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Place {
//@Autowired
  /* @Autowired private Manul cat1;                    // 3 вариант внедрение ч\з св-во
   @Autowired private  Sphynx cat2;

    public Sphynx getCat2() {
        return cat2;
    }

    public Manul getCat1() {
        return cat1;
    }*/

   /* @Autowired                              // внедрение ч\з Сеттер
    public void setCat(Manul cat) {
        this.cat = cat;
    }*/

    public Place(){}
                                                // если конструктор не единственный нужно указывать @Autowired
    /* @Autowired                                     // у Бина должен быть коннструктор по умолчанию
    public Place(Manul cat) {                     // @Autowired   внедрение ч\з конструктор
        this.cat = cat;
    }*/
    @Autowired private Cat cat1;
    @Autowired @Qualifier("hairless")
    private  Cat cat2;            // не приоритетный Бин, явное указание

    public Cat getCat2() {
        return cat2;
    }

    public Cat getCat1() {
        return cat1;
    }
}
