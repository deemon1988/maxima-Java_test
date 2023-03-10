package org.example;

import org.example.model.Address;
import org.example.model.Doctor;
import org.example.model.Patient;
import org.example.model.Person;
import org.example.repository.BaseRepository;
import org.example.repository.CatRepository;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) throws Exception {
        Address johnDoeAddress = new Address("100 Elm Way", "Foo City", "NJ", "01234");
        Person johnDoe = new Person("John", "Doe", null, 29, true, johnDoeAddress);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(johnDoe);
        mapper.writeValue(new File("john.json"), johnDoe);
        System.out.println(json);

        String jsonStr = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"alias\":\"Jay\","
                + "\"age\":29,\"address\":{\"street\":\"100 Elm Way\",\"city\":\"Foo City\","
                + "\"state\":\"NJ\",\"zipCode\":\"01234\"},\"isMale\":true, \"favoriteColor\":\"blue\"}";

        String wr = "[{\"id\":1,\"name\":\"J. Smalling\",\"doctor\":{\"id\":null,\"name\":\"Dr. Who\"," +
                "\"speciality\":\"General Practitioner\",\"patienList\":[]}}," +
                "{\"id\":2,\"name\":\"Samantha Williams\",\"doctor\":null}]";

        ObjectMapper mapper1 = new ObjectMapper();
        @SuppressWarnings("unchecked")
        List<Patient> patientList = mapper1.readValue(new File("patients.json"), List.class);
        System.out.println("From file: "+patientList);
        Person john = mapper1.readValue(new File("john.json"), Person.class);
        System.out.println("From file: "+john);
       // Patient patient = mapper1.readValue(wr, Patient.class);
       // Person person = mapper1.readValue(jsonStr, Person.class);


        Patient patient1 = new Patient(1L,"J. Smalling", null);
        Patient patient2 = new Patient(2L,"Samantha Williams", null);
        List<Patient> patienList = List.of(patient1,patient2);

        Doctor doctor = new Doctor("Dr. Who", "General Practitioner",new ArrayList<>());

        patient1.setDoctor(doctor);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonObject = objectMapper.writeValueAsString(patienList);


        System.out.println(jsonObject);

    }





}

       /* City Spb = new City("Санкт-Петербург", 120, true, true);
        City Murmansk = new City("Мурманск", 1400, false, true);
        City Tver = new City("Тверь", 540, false, true);
        City myCity = new City("Город", 540);
        City Mosсow = new City("Москва", 800, true, true);

        Truck trailer_truck = new Truck("Грузовик с полуприцепом", 44000, 90, 150.41, false);
        Ship tanker = new Ship("Танкер", 18159000, 27, 300.82,false);
        Plane aircraft = new Plane("Самолёт", 120000, 800, 600.68,false);
        Ship kater = new Ship("Катер", 1815, 90, 100.82, false);


        Logistics logistics = new Logistics(tanker, aircraft, kater, trailer_truck, aircraft, tanker, aircraft);


        logistics.getShipping(Murmansk, 43000, 52);*/
//        Birthday.nextBirthday(1983,9,11);
//        Birthday.getAge(1983,9,11);



       /* TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.getTransport(Mosсow, 1200, 1);*/

      /*  File fileIn = new File("C:\\Users\\deemn\\Desktop\\Java_Projects\\maxima-Java_test\\cat.csv");
        File fileOut = new File("cat.txt");*/

        /*TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform(fileIn.getPath(), fileOut.getPath());
        System.out.println();*/
/*
      StreamTransformer streamTransformer = new StreamTransformer();
       streamTransformer.transform(String.valueOf(fileIn),"cat.txt" );*/




