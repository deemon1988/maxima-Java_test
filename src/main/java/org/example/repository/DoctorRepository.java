package org.example.repository;

import org.example.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor getDoctorByIdWithPatients(Long id);
}
