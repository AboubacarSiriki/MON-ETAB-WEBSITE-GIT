package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Teachers")
public class TeacherControlleur {

    @GetMapping
    public String showTeacher(){
        return "/Teacher/professeur";
    }

    @GetMapping("/addTeacher")
    public String showAjouterEleve(){
        return "/Teacher/form";
    }

    @GetMapping("/updateTeacher")
    public String showModifierEleve(){
        return "/Teacher/form";
    }

}
