package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Patient {
    private Long id;
    private String name;

    private Doctor doctor;

    protected Patient() {
    }

    public Patient(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doctor=" + doctor +
                ']';
    }
}
