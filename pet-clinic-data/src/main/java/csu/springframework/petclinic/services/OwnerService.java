package csu.springframework.petclinic.services;

import csu.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
