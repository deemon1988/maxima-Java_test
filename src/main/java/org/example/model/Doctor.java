package org.example.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import java.util.List;

@Getter
@Setter
public class Doctor {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String speciality;

    private List<Patient> patienList;

    public Doctor(String name, String speciality, List<Patient> patienList) {
        this.name = name;
        this.speciality = speciality;
        this.patienList = patienList;
    }

    protected Doctor() {
    }


    @Override
    public String toString() {
        return "Doctor[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", patienList=" + patienList +
                ']';
    }
}
