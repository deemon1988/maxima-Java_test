package org.example;

import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {

        TreeMap<Person, Integer> map = new TreeMap<>(Comparator.comparingInt(o -> o.age));
        map.put(new Person("John", "Smith", 17), 0);
        map.put(new Person("Ivan", "Petrenko", 65), 0);
        map.put(new Person("Pedro", "Escobar", 32), 0);
        map.put(new Person("Radion", "Pyatkin", 14), 0);
        map.put(new Person("Sergey", "Vashkevich", 19), 0);
        Person firstAdultPerson = map.navigableKeySet().stream().filter(person -> person.age > 18).findFirst().get();
        Map<Person, Integer> youngPeopleMap = map.headMap(firstAdultPerson, false);
        Map<Person, Integer> adultPeopleMap = map.tailMap(firstAdultPerson, true);
        showAdvertisementToYoung(youngPeopleMap);
        showAdvertisementToAdult(adultPeopleMap);
        System.out.println();

        HashMap<Person, Integer> hMap = new HashMap<>();
        hMap.put(new Person("John", "Smith", 17), 0);
        hMap.put(new Person("Ivan", "Petrenko", 65), 0);
        hMap.put(new Person("Pedro", "Escobar", 32), 0);
        hMap.put(new Person("Radion", "Pyatkin", 14), 0);
        hMap.put(new Person("Sergey", "Vashkevich", 19), 0);

        System.out.println("HashMap - "+ hMap.toString());
for (Map.Entry entry: hMap.entrySet()){
    Person key = (Person)entry.getKey();
    Integer value = (Integer) entry.getValue();
    System.out.println("keys - "+key+" values - "+value);
}
        System.out.println();

    Iterator<Map.Entry<Person, Integer>> itr = hMap.entrySet().iterator();
    while (itr.hasNext()){
    Map.Entry<Person, Integer> entry = itr.next();
    Person key = entry.getKey();
    Integer value = entry.getValue();
    System.out.println("keys - "+key+" _values_ - "+value);
}
        System.out.println();

    List<Person> keyList = new ArrayList<>(hMap.keySet());
    List<Integer> valueList = new ArrayList<>(hMap.values());
    List<Map.Entry<Person, Integer>> entryList = new ArrayList<>(hMap.entrySet());
        System.out.println(keyList);
        System.out.println(valueList);
        System.out.println(entryList + "\n");

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("A1020", 1000);
        hm.put("A1021", 4000);
        hm.put("A1022", 3200);
        hm.put("A1023", 2500);
        hm.put("A1024", 4900);

        Set<Map.Entry<String, Integer>> s = hm.entrySet();
        System.out.println("Set - " +s.toString()+ "\n");
        for(Map.Entry<String, Integer> me : s) {
            System.out.println("Original entry: " + me.getKey() + " : " + me.getValue());
            me.setValue(me.getValue() + 200);
            System.out.println("Revised entry: " + me.getKey() + " : " + me.getValue());
        }


    }

    public static class Person {
        public String firstName;
        public String lastName;
        public int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        @Override
        public String toString() {

            return firstName+" "+lastName+" "+age;
        }
    }
    public static void showAdvertisementToYoung(Map map){
        System.out.println(map);
    }
    public static void showAdvertisementToAdult(Map map){

        Iterator<Map.Entry<Person, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<Person, Integer> pair = iterator.next();
            Person key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
