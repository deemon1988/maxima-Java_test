package org.example.repository;

import org.example.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class AdvancedPatientRepository implements PatientBaseRepository{
    @Override
    public Patient getPatientById(Long id) {
        return new Patient(id, "Samuel Bradford");
    }


    public List<Patient> getPatients() {
        List<Patient> patientList = new ArrayList<>();

        return patientList;
    }

}
