package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.repositories.FicheRepository;
import ci.digitalacademy.monetab.services.FicheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FicheNoteServiceImpl implements FicheService
{
    private final FicheRepository ficheRepository;

    @Override
    public FicheNote save(FicheNote ficheNote) {
        return ficheRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
        return null;
    }

    @Override
    public Optional<FicheNote> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<FicheNote> findAll() {
        return ficheRepository.findAll();
    }

    @Override
    public void delecte(Long id) {

    }
}
