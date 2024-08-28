package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface FicheService {

    FicheNote save(FicheNote ficheNote);

    FicheNote update(FicheNote ficheNote);

    Optional<FicheNote> findOne(Long id);

    List<FicheNote> findAll();

    void delecte(Long id);
}
