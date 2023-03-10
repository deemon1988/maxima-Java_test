package org.example.repository;

import org.example.model.Doctor;
import org.example.model.Patient;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
public class AdvancedDoctorRepository implements DoctorBaseRepository {

    @Override
    public Doctor getDoctorById(Long id) {
        return null;
    }

    @Override
    public Doctor getDoctorByIdWithPatients(Long id) {
        List<Patient> patientList = new ArrayList<>();

        patientList.add(new Patient(1L, "J. Smalling"));
        patientList.add(new Patient(2L, "Samantha Williams"));

        return new Doctor("Dr. Sanders", "General", patientList);
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctorDtoList = new ArrayList<>();

        doctorDtoList.add(new Doctor ( "Dr. Sanders", "General",null));
        doctorDtoList.add(new Doctor( "Dr. Goldberg", "General",null));

        return doctorDtoList;
    }

    @Override
    public List<Doctor> getDoctorsWithPatients() {
        return null;
    }

}
