package org.example.service;

import org.example.model.Patient;
import org.example.repository.PatientBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired PatientBaseRepository repoPatient;

    public Patient getPatient(Long id){
        return repoPatient.getPatientById(id);
    }
}
