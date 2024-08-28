package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.User;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);

    Student update(Student student);

    Optional<Student> findOne(Long id);

    List<Student> findAll();

    void delecte(Long id);
}
