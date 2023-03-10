package org.example.controller;

import org.example.model.Doctor;
import org.example.model.DoctorModelAssembler;
import org.example.model.Patient;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/doctorsV2")
public class DoctorHateoasController {
    @Autowired private DoctorService doctorService;
    @Autowired DoctorModelAssembler assembler;
    @GetMapping("/doctor/{id}")
    public EntityModel<Doctor> getDoctorbyId(@PathVariable Long id){
       return assembler.toModel(doctorService.getDoctorWithPatients(id));
    }
}
