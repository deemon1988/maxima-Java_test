package org.example.controller;

import org.example.model.Patient;
import org.example.model.PatientModelAssembler;
import org.example.service.PatientService;
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
@RequestMapping("/patientsV2")
public class PatientHateoasController {
    @Autowired private PatientService patientService;
    @Autowired PatientModelAssembler assembler;
    @GetMapping("/patient/{id}")
    public EntityModel<Patient> getPatientById(@PathVariable Long id){
      return assembler.toModel(patientService.getPatient(id));
    }
}
