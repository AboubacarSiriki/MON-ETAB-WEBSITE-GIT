package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Students")
public class StudentControlller {

        @GetMapping
        public String showStudentPage(){
            return "/student/eleve";
        }


        @GetMapping("/Ajouter_Eleve")
        public String showAjouterEleve(){
            return "/student/form";
        }

    @GetMapping("/Modifier_Eleve")
    public String showModifierEleve(){
        return "/student/form";
    }
}
