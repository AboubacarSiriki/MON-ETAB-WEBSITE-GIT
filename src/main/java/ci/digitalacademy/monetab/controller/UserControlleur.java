package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Users")
public class UserControlleur {

    @GetMapping
    public String showUserPage(){
        return "/User/utilisateur";
    }

    @GetMapping("/addUser")
    public String showAddUserPage(){
        return "/User/form";
    }

    @GetMapping("/updateUser")
    public String showUpdateUserPage(){
        return "/User/form";
    }
}
