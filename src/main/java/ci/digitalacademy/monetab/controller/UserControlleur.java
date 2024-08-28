package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Users")
@RequiredArgsConstructor
public class UserControlleur {

    private final UserService userService;

    @GetMapping
    public String showUserPage(Model model){

        List<User> users = userService.findAll();
        model.addAttribute("users",users);

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
