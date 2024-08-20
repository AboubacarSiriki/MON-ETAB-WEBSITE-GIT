package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Modifier_eleve")
public class ModifierEleveControlleur {

    @GetMapping
    public String showModifierEleve(){
        return "modifier_eleve";
    }
}
