package csu.springframework.petclinic.repositories;

import csu.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
