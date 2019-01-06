package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SDVetJpaService implements VetService {

    private final VetRepository vetRepository;

    public SDVetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Optional<Vet> findByLastName(String lastName) {
        return Optional.ofNullable(vetRepository.findByLastName(lastName));
    }

    @Override
    public Set<Vet> findAll() {
        HashSet<Vet> vets = new HashSet<>();
         vetRepository.findAll().forEach(vet -> {
            vets.add(vet);
        });
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        Optional<Vet> optionalVet = Optional.ofNullable(vetRepository.findById(id).get());
        return optionalVet.orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }
}
