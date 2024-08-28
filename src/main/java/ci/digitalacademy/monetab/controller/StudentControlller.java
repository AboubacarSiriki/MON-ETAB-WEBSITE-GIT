package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("/Students")
public class StudentControlller {

    private final StudentService studentService;

        @GetMapping
        public String showStudentPage(Model model){
            List<Student> students = studentService.findAll();
            model.addAttribute("students",students);
            return "/student/list";
        }

        @GetMapping("/show_add_Student_form")
        public String showaddStudentform(Model model){

            log.debug("Request to show add teacher forms");
            model.addAttribute("students", new Student());
            return "/student/form";
        }

        @PostMapping
        public String saveStudent(Student student){

            log.debug("Request to save teacher : {}",student );
            studentService.save(student);

            return "redirect:/Students";
        }

        @GetMapping("/updateStudent/{id}")
        public String showModifierEleve(Model model, @PathVariable Long id){

            log.debug("Request to show update teacher forms");
            Optional<Student> student = studentService.findOne(id);
            if (student.isPresent()){
                model.addAttribute("students" , student.get());
                return "student/form";
            } else {
                return "redirect:/Students";
            }

        }

    @PostMapping("/deleteStudent/{id}")
    public String showDeleteStudent(@PathVariable Long id) {
        log.debug("Request to delete teacher with id: {}", id);
        studentService.delecte(id);
        return "redirect:/Students";
    }
}
