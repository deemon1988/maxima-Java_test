package org.example.service;

import org.example.exceptions.DoctorNotFoundException;
import org.example.model.Doctor;
import org.example.repository.DoctorBaseRepository;
import org.example.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {
    @Autowired private DoctorBaseRepository repo;

  /*  public Doctor getDoctor(Long id){
        return repo.findById(id).orElseThrow(() -> new DoctorNotFoundException(id.toString()));
    }*/
    public Doctor getDoctorWithPatients(Long id){
        return repo.getDoctorByIdWithPatients(id);
    }

    public List<Doctor> getDoctors(){

        List<Doctor> doctorDtoList = repo.getDoctors();
        return doctorDtoList;
      /*  return doctorDtoList.stream()
                .map(DoctorMapper.INSTANCE::toModel)
                .collect(Collectors.toList());*/
    }
}


