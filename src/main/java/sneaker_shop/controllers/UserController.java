package sneaker_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sneaker_shop.models.user.User;
import sneaker_shop.service.UserService;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/reg")
    public String getRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "user/registration";
    }

    @PostMapping("/reg")
    public String createUser(@ModelAttribute(value = "user") User user,
                             @RequestParam("password_confirmation") String passwordConfirmation, Model model){
        if(user.getPassword() != passwordConfirmation){
            model.addAttribute("user", user);
            return "user/registration";
        }
        userService.createOrUpdateUser(user);
        return "account/account";
    }

    @GetMapping("/auth")
    public String getAuthorizationPage(){
        return "user/authorization";
    }

    @PostMapping("/auth")
    public String authorizationUser(@RequestParam("login") String id,
                                          @RequestParam("password") String password,
                                          HttpSession session){
//        User user = userService.getUserByLoginAndPassword(login, password);

        User user = userService.getById(Integer.parseInt(id));
        if(user != null){
            user = (User) session.getAttribute("user");
            session.setAttribute("user", user);
            return "account/account";
        }
        return "user/authorization";
    }

    @GetMapping("/")
    public void addUserToSession(HttpSession httpSession){
        httpSession.setAttribute("user", new User());
    }

}
