package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Optional;
import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Optional<Vet> findByLastName(String lastName);

}
