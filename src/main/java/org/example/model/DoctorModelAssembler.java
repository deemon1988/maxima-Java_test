package org.example.model;

import org.example.controller.DoctorHateoasController;
import org.example.controller.PatientHateoasController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class DoctorModelAssembler implements RepresentationModelAssembler<Doctor, EntityModel<Doctor>> {
    @Override
    public EntityModel<Doctor> toModel(Doctor entity) {
         return EntityModel.of(entity,
                linkTo(methodOn(DoctorHateoasController.class).getDoctorbyId(entity.getId())).withSelfRel()
                // ,linkTo(methodOn(PatientHateoasController.class).getPatients()).withRel("band")
        );
    }

    @Override
    public CollectionModel<EntityModel<Doctor>> toCollectionModel(Iterable<? extends Doctor> entities) {
        return RepresentationModelAssembler.super.toCollectionModel(entities);
    }
}
