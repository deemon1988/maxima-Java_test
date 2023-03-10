package org.example.repository;

import org.example.model.Doctor;

import java.util.List;

public interface DoctorBaseRepository {
    Doctor getDoctorById(Long id);
    Doctor getDoctorByIdWithPatients(Long id);
    List<Doctor> getDoctors();
    List<Doctor> getDoctorsWithPatients();
}
