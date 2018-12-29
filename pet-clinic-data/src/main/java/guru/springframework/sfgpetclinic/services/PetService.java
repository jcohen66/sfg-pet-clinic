package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Optional;
import java.util.Set;

public interface PetService {

    Optional<Pet> findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
