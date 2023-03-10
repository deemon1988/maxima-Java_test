package org.example.model;

import org.example.controller.PatientHateoasController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class PatientModelAssembler implements RepresentationModelAssembler<Patient, EntityModel<Patient>> {
    @Override
    public EntityModel<Patient> toModel(Patient entity) {
        return EntityModel.of(entity,
                linkTo(methodOn(PatientHateoasController.class).getPatientById(entity.getId())).withSelfRel()
               // ,linkTo(methodOn(PatientHateoasController.class).getPatients()).withRel("band")
        );
    }


}
