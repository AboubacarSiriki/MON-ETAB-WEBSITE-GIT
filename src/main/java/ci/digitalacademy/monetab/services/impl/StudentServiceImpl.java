package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Optional<Student>optionalStudent=findOne(student.getId());//recupertion d'un Optional<User>
        if(optionalStudent.isPresent()){ //verification de l'existance d'un contenu dans le optimal
            Student studentToUpdate = optionalStudent.get(); //declaration + affection d'u user à partir du optimal
            studentToUpdate.setMatricule(student.getMatricule()); //mise à jour du pseud
            //mise à jour du pseud

            log.info("Request to update user in progress");

            return save(studentToUpdate ); //enregistrement de l'utilisateur
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        studentRepository.deleteById(id);
    }
}
