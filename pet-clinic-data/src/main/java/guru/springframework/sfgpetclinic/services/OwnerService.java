package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface OwnerService extends CrudRepository<Owner, Long> {

    Optional<Owner> findByLastName(String lastName);

    Optional<Owner> findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
