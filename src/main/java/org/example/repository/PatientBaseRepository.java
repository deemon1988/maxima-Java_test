package org.example.repository;

import org.example.model.Doctor;
import org.example.model.Patient;

import java.util.List;

public interface PatientBaseRepository {
    Patient getPatientById(Long id);
  //  List<Patient> getPatients();
}
