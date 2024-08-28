package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.repositories.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class AdresseServiceImpl implements AdresseService {

    private final AdresseRepository adresseRepository;

    @Override
    public Adresse save(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse update(Adresse adresse) {
        return null;
    }

    @Override
    public Optional<Adresse> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Adresse> findAll() {
        return List.of();
    }

    @Override
    public void delecte(Long id) {

    }
}
