package sneaker_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(name = "/account")
public class AccountController {

    @GetMapping("/detail")
    public String getUserData(){
        return "account/detail";
    }
}
