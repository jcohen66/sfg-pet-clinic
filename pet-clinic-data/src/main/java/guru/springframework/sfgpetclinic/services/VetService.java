package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Optional;
import java.util.Set;

public interface VetService {

    Optional<Vet> findByLastName(String lastName);

    Optional<Vet> findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
